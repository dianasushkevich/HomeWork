package comparators;
import DTO.Animal;
import java.util.Comparator;

public class CompareAgeForAnimals implements Comparator<Animal> {
    @Override
    // Метод сравнивает возраст двух животных
    public int compare(Animal o1, Animal o2) {
        // Если возраст первого животного меньше возраста второго животного, возвращаем -1
        if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        // Если возраст первого животного равен возрасту второго животного, возвращаем 0
        else if (o1.getAge() == o2.getAge()) {
            return 0;
        }
        // Если возраст первого животного больше возраста второго животного, возвращаем 1
        else {
            return 1;
        }
    }
}