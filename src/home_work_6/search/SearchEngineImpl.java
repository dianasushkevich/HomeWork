package search;
import api.ISearchEngine;

public class SearchEngineImpl implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        long counter = 0;
        int index = text.indexOf(word);
        while (index != -1) {
            counter++;
            index = text.indexOf(word, index + 1);
        }
        return counter;
    }
}