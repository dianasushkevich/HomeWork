package comparators;
import DTO.Animal;
import java.util.Comparator;

public class CompareAgeAndNickForAnimals implements Comparator<Animal> {

    // Переопределяем метод compare для сравнения двух объектов типа Animal
    @Override
    public int compare(Animal o1, Animal o2) {
        // Если возраст первого животного меньше возраста второго, возвращаем -1
        if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        // Если возраста животных равны, сравниваем их клички
        else if (o1.getAge() == o2.getAge()) {
            // Сравниваем клички первого и второго животного методом compareTo и возвращаем результат компарации
            return o1.getNick().compareTo(o2.getNick());
        }
        // Если возраст первого животного больше возраста второго, возвращаем 1
        else {
            return 1;
        }
    }
}