package search;
import api.ISearchEngine;

/*4.4* Написать декоратор для ISearchEngine,
 который будет позволять искать данные без учёта регистра */
public class SearchEngineCaseInsensitive implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEngineCaseInsensitive(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        text = text.toLowerCase();
        word = word.toLowerCase();
        return searchEngine.search(text, word);
    }
}