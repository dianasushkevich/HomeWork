import DTO.Animal;
import DTO.Person;
import comparators.CompareAgeAndNickForAnimals;
import comparators.ComparePasswordLengthForPerson;
import utils.GenerateRandomName;
import java.util.*;

public class OperationWithCollectionsImpl implements Operations {

    @Override
    public <T> void doOperations(T t, Collection collection, int count) {

        if (t instanceof Person) {

            stoppedTime(() -> generateObjectAndFillCollection((Person) t, collection, count), "Заполнение коллекции Person " + collection.getClass().getName());

            if (collection instanceof List) {
                sortCollection((List) collection, new ComparePasswordLengthForPerson());
                sortCollectionWithJDK((List) collection, new ComparePasswordLengthForPerson());
            }


        } else {
            stoppedTime(() -> generateObjectAndFillCollection((Animal) t, collection, count), "Заполнение коллекции Animal " + collection.getClass().getName());

            if (collection instanceof List) {
                sortCollection((List) collection, new CompareAgeAndNickForAnimals());
                sortCollectionWithJDK((List) collection, new CompareAgeAndNickForAnimals());
            }

        }
        stoppedTime(() -> removeElements(collection), "Удаление всех элементов коллекции " + collection.getClass().getName());

    }

    //Генерирует объекты и заполняет ими коллекцию//
    private void generateObjectAndFillCollection(Person person, Collection<Person> collection, int count) {
        for (int i = 0; i < count; i++) {
            collection.add(new Person
                    (GenerateRandomName.generateRussianName(),
                            UUID.randomUUID().toString().substring(0, 9),
                            GenerateRandomName.generateRandomName()));
        }
    }

    //Генерирует объекты и заполняет ими коллекцию//
    private void generateObjectAndFillCollection(Animal animal, Collection<Animal> collection, int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            collection.add(new Animal(
            ));
        }
    }

    //Сортировка коллекции с использованием компаратора//
    private static <T> void sortCollection(List<T> list, Comparator<T> comparator) {
        Collections.sort(list, comparator);
    }

    private static <T> void sortCollectionWithJDK(List<T> list, Comparator<T> comparator) {
        Collections.sort(list, comparator);
    }

    //Удаляет все элементы из коллекции//
    private static void removeElements(Collection collection) {
        Object[] o = collection.toArray();
        for (int i = 0; i < o.length; i++) {
            collection.remove(o[i]);
        }
    }

    //Выводит в консоль переданную строку//
    private static void printElement(String element) {
        System.out.println("Элемент: " + element);
    }

    //Замеряет время исполнения переданного метода//
    private static void stoppedTime(Runnable operation, String operationName) {
        long startTime = System.currentTimeMillis();
        operation.run();
        long endTime = System.currentTimeMillis();
        System.out.println("Операция: " + operationName + ". Заняла " + (endTime - startTime) + " мс");
    }
}