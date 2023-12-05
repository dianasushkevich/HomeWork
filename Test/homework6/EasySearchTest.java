package homework6;

import static org.junit.Assert.*;
import api.ISearchEngine;
import org.junit.Before;
import org.junit.Test;
import search.EasySearch;


public class EasySearchTest {

    private ISearchEngine searchEngine;

    @Before
    public void setUp() {
        searchEngine = new EasySearch();
    }

    @Test
    public void testSearchWithPunctuation() {
        String text = "привет, как дела!";
        String word = "дела";
        long expectedResult = 1;

        assertEquals(expectedResult, searchEngine.search(text, word));
    }

    @Test
    public void testSearchWithoutPunctuation() {
        String text = "привет,какдела!";
        String word = "дела";
        long expectedResult = 1;

        assertEquals(expectedResult, searchEngine.search(text, word));
    }

    @Test
    public void testSearchWithSemicolon() {
        String text = "привет;какдела!";
        String word = "дела";
        long expectedResult = 1;

        assertEquals(expectedResult, searchEngine.search(text, word));
    }

    @Test
    public void testSearchWithHyphenatedWord() {
        String text = "Привет-привет";
        String word = "привет";
        long expectedResult = 1;

        assertEquals(expectedResult, searchEngine.search(text, word));
    }


    @Test
    public void testSearchWithNumericWord() {
        String text = "4-х";
        String word = "4-х";
        long expectedResult = 1;

        assertEquals(expectedResult, searchEngine.search(text, word));
    }

    @Test
    public void testSearchWithNumbersAndWords() {
        String text = "один и 1";
        String word = "и";
        long expectedResult = 1;

        assertEquals(expectedResult, searchEngine.search(text, word));
    }

}