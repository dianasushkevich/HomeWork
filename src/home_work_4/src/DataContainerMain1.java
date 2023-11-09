package src;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerMain1 {
    public static void main(String[] args) {
        DataContainer1<Integer> container = new DataContainer1<>(new Integer[]{1, 2, 3, null, null, null});
        System.out.println(container.add(777));
        System.out.println(container.add(null));
        System.out.println(container.add(777));

        System.out.println(container.get(0));
        System.out.println(container.get(1));

        System.out.println(Arrays.toString(container.getItems()));

        System.out.println(container.delete(1));
        System.out.println(container.delete(9));

        System.out.println(container.delete(null));
        System.out.println(container.delete(777));
        System.out.println(container.delete(111));

        container.sort(Comparator.naturalOrder());
        System.out.println(container);
    }
}