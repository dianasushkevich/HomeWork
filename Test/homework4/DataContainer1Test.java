package homework4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.DataContainer1;

import java.util.Comparator;

class DataContainer1Test {

    private DataContainer1<Integer> container;

    @BeforeEach
    void setUp() {
        Integer[] data = {1, 2, 3};
        container = new DataContainer1<>(data);
    }

    @Test
    void add() {
        int value = 4;
        int index = container.add(value);
        assertEquals(value, container.get(index));
    }

    @Test
    void get() {
        assertEquals(2, container.get(1));
    }

    @Test
    void getOutOfRange() {
        assertNull(container.get(3));
    }

    @Test
    void getItems() {
        Integer[] expected = {1, 2, 3};
        assertArrayEquals(expected, container.getItems());
    }

    @Test
    void deleteByIndexOutOfRange() {
        assertFalse(container.delete(3));
    }

    @Test
    void deleteByValueNull() {
        assertFalse(container.delete(null));
    }

    @Test
    void sort() {
        Integer[] expected = {3, 2, 1};
        container.sort(Comparator.reverseOrder());
        assertArrayEquals(expected, container.getItems());
    }

    @Test
    void sortStatic() {
        Integer[] expected = {1, 2, 3};
        DataContainer1.sort(container);
        assertArrayEquals(expected, container.getItems());
    }

    @Test
    void iteratorHasNext() {
        assertTrue(container.iterator().hasNext());
    }

    @Test
    void iteratorNext() {
        assertEquals(1, container.iterator().next());
    }
}