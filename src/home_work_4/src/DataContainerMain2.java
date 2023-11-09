package src;

import src.comparators.StringAlphabeticComparator;
import src.comparators.StringLengthComparator;
public class DataContainerMain2 {
        public static void main(String[] args) {
        DataContainer2<String> container = new DataContainer2<>();
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");

        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);

        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом

        container.delete(text1);

        System.out.println(container.get(index1)); //Как дела

        container.sort(new StringLengthComparator());
        System.out.println(container); // ["Привет", "Работаю", "Как дела", "Давай потом"]
        container.sort(new StringAlphabeticComparator());
        System.out.println(container); // ["Давай потом", "Как дела", "Привет", "Работаю"]
    }
}
