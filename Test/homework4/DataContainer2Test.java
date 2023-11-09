package homework4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.DataContainer2;

class DataContainer2Test {

    private DataContainer2<Integer> container;

    @BeforeEach
    void setUp() {
        container = new DataContainer2<>();
    }

    @Test
    void add() {
        int value = 5;
        int index = container.add(value);
        assertEquals(value, container.get(index));
    }

    @Test
    void get() {
        container.add(1);
        container.add(2);
        container.add(3);
        assertEquals(2, container.get(1));
    }

    @Test
    void sort() {
        container.add(3);
        container.add(1);
        container.add(2);
        container.sort(Integer::compare);
        assertEquals("[1, 2, 3]", container.toString());
    }

    @Test
    void testToString() {
        container.add(1);
        container.add(2);
        container.add(3);
        assertEquals("[1, 2, 3]", container.toString());
    }
}