import DTO.Animal;
import DTO.Person;
import utils.GenerateRandomName;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Operations operations = new OperationWithCollectionsImpl();

        Animal animal = new Animal();

        List<Animal> linkedAnimals = new LinkedList<>();
        operations.doOperations(animal,linkedAnimals,1_000_000);
        List<Animal> arrayAnimals = new ArrayList<>();
        operations.doOperations(animal,arrayAnimals,1_000_000);
        Set<Animal> hashSetAnimals = new HashSet<>();
        operations.doOperations(animal,hashSetAnimals,1_000_000);
        Set<Animal> treeSetAnimals = new TreeSet<>();
        operations.doOperations(animal,treeSetAnimals,1_000_000);


        Person person = new Person(GenerateRandomName.generateRussianName(), UUID.randomUUID().toString().substring(0, 9), GenerateRandomName.generateRandomName());

        List<Person> linkedPersons = new LinkedList<>();
        operations.doOperations(person,linkedPersons,1_000_000);
        List<Person> arrayPersons = new ArrayList<>();
        operations.doOperations(person,arrayPersons,1_000_000);
        Set<Person> hashSetPersons = new HashSet<>();
        operations.doOperations(person,hashSetPersons,1_000_000);
        Set<Person> treeSetPersons = new TreeSet<>();
        operations.doOperations(person,treeSetPersons,1_000_000);

    }
}
