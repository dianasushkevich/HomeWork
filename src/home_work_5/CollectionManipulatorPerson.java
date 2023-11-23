import DTO.Person;
import utils.GenerateRandomName;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CollectionManipulatorPerson {

    public void performCollectionActions(List<Person> collection) {
        // Код для выполнения основных действий над коллекцией
    }

    public List<Person> generatePersons(int quantity) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            Person person = new Person(GenerateRandomName.generateRussianName(), UUID.randomUUID().toString().substring(0, 9), GenerateRandomName.generateRandomName());
            // Генерация данных для Person
            persons.add(person);
        }
        return persons;
    }

    public static void main(String[] args) {
        CollectionManipulatorPerson utils = new CollectionManipulatorPerson();
        List<Person> persons = utils.generatePersons(10);
        utils.performCollectionActions(persons);
    }
}