package search;
import api.ISearchEngine;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* 4.5** Написать декоратор SearchEngineCaseNormalizer
для ISearchEngine который будет приводить все слова к единому падежу*/

public class SearchEngineCaseNormalizer implements ISearchEngine {

    private final ISearchEngine engine;
    private final List<String> endList = new ArrayList<>();
    private final String[] nounEnd = {"а", "я", "о", "е", "ы", "и", "у", "ю", "ой", "ей", "ом", "ем", "ём", "ями", "ами",
            "ях", "ям"};
    private final String[] adjectiveEnd = {"ий", "ый", "ая", "яя", "ое", "ее", "его", "ого", "ей", "ой", "ему", "ому", "ую",
            "юю", "им", "ым", "ем", "ом"};

    {
        for (String end : nounEnd) {
            if (!endList.contains(end)) {
                endList.add(end);
            }
        }

        for (String end : adjectiveEnd) {
            if (!endList.contains(end)) {
                endList.add(end);
            }
        }
        endList.add("");
    }

    public SearchEngineCaseNormalizer(ISearchEngine engine) {
        this.engine = engine;
    }

    /**
     * Осуществляет поиск переданного слова во всех падежах. Работает со словами длиной более 2 символов
     */
    @Override
    public long search(String text, String word) {

        long counter = 0;
        int wordLength = word.length();
        int endLength;
        String tempWord = "";
        int iterationNumber = 1;

        // если слово короче 3 букв, то осуществляем обычный поиск
        if (wordLength > 2) {

            for (String end : endList) {
                endLength = end.length();
                if (Objects.equals(end, word.substring(wordLength - endLength, wordLength))) {
                    tempWord = word.substring(0, wordLength - endLength);
                    break;
                }
            }

            // если последняя буква в слове мягкий знак, то повторяем цикл еще раз без учета последней буквы
            if (word.charAt(wordLength - 1) == 'ь') {
                iterationNumber++;
            }

            for (int i = 0; i < iterationNumber; i++) {

                if (i > 0) {
                    tempWord = tempWord.substring(0, tempWord.length() - i);
                }

                for (String end : endList) {
                    counter += this.engine.search(text, tempWord + end);
                }
            }
        } else {
            counter = this.engine.search(text, word);
        }
        return counter;
    }
}