import DTO.Animal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//Работа с коллекциями. 6.0. Выполняем действия над экземплярами класса Animal
public class CollectionManipulatorAnimal {

    public static void main(String[] args) {
        List<Animal> animalList = generateAnimalCollection(10);
        manipulateCollection(animalList);
    }

    public static List<Animal> generateAnimalCollection(int quantity) {
        List<Animal> animals = new ArrayList<>();

        for (int i = 1; i <= quantity; i++) {
            Animal animal = new Animal();
            animals.add(animal);
        }

        return animals;
    }

    public static void manipulateCollection(Collection<Animal> animals) {
        // Выводим коллекцию на экран
        System.out.println("Исходная коллекция:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // Выводим отсортированную коллекцию на экран
        System.out.println("\nОтсортированная коллекция:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // Удаляем животное с возрастом 5
        Animal animalToRemove = new Animal();
        animals.remove(animalToRemove);

        // Выводим измененную коллекцию на экран
        System.out.println("\nИзмененная коллекция:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}