package search;
import api.ISearchEngine;

/*4.3* Написать декоратор SearchEnginePunctuationNormalizer
для ISearchEngine который будет удалять нежелательные символы*/

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private final ISearchEngine engine;

    public SearchEnginePunctuationNormalizer(ISearchEngine engine) {
        this.engine = engine;
    }

    @Override
    public long search(String text, String word) {
        return this.engine.search(text, word);
    }

    public String deleteSymbols(String text, String[] replace, String replaceBy) {

        for (int i = 0; i < replace.length; i++) {
            text = text.replaceAll(replace[i], replaceBy);
        }
        return text;
    }
}