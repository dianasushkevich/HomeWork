package homework4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.DataContainer2;
import src.comparators.StringAlphabeticComparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataContainerMain2Test {

    private DataContainer2<String> container;

    @BeforeEach
    public void setUp() {
        container = new DataContainer2<>();
    }

    @Test
    public void testAddAndGet() {
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");

        assertEquals("Привет", container.get(index1));
        assertEquals("Как дела", container.get(index2));
        assertEquals("Работаю", container.get(index3));
        assertEquals("Давай потом", container.get(index4));
    }

    @Test
    public void testSort() {
        container.add("Привет");
        container.add("Как дела");
        container.add("Работаю");
        container.add("Давай потом");

        container.sort(new StringAlphabeticComparator());
        assertEquals("Давай потом", container.get(0));
        assertEquals("Как дела", container.get(1));
        assertEquals("Привет", container.get(2));
        assertEquals("Работаю", container.get(3));
    }
}