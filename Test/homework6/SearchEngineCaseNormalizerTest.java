package homework6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import search.SearchEngineCaseNormalizer;
import search.SearchEngineImpl;

public class SearchEngineCaseNormalizerTest {

    private final SearchEngineCaseNormalizer engine = new SearchEngineCaseNormalizer(new SearchEngineImpl());

    @Test
    public void testSearch1() {
        String text = "привет, как дела!";
        String word = "привет";
        long expectedResult = 1;

        long result = engine.search(text, word);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testSearch2() {
        String text = "привет,какдела!";
        String word = "какдела";
        long expectedResult = 0;

        long result = engine.search(text, word);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testSearch3() {
        String text = "привет;какдела!";
        String word = "какдела";
        long expectedResult = 0;

        long result = engine.search(text, word);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testSearch4() {
        String text = "как дела!.Что делаешь?";
        String word = "как";
        long expectedResult = 1;

        long result = engine.search(text, word);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testSearch5() {
        String text = "Привет-привет";
        String word = "Привет-привет";
        long expectedResult = 1;

        long result = engine.search(text, word);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testSearch6() {
        String text = "Привет -привет";
        String word = "Привет";
        long expectedResult = 1;

        long result = engine.search(text, word);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testSearch7() {
        String text = "4-х";
        String word = "4-х";
        long expectedResult = 1;

        long result = engine.search(text, word);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testSearch8() {
        String text = "один и 1";
        String word = "один";
        long expectedResult = 1;

        long result = engine.search(text, word);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testSearch9() {
        String text = "бабушка бабушке бабушку";
        String word = "бабушка";
        long expectedResult = 3;

        long result = engine.search(text, word);

        Assertions.assertEquals(expectedResult, result);
    }
}