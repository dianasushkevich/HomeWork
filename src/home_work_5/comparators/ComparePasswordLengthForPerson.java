package comparators;
import DTO.Person;
import java.util.Comparator;

public class ComparePasswordLengthForPerson implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        // Сравниваем длину паролей объектов o1 и o2
        if (o1.getPassword().length() < o2.getPassword().length()) {
            /* Если длина пароля у объекта o1 меньше длины пароля у объекта o2,
             возвращаем -1, чтобы указать, что o1 должен быть расположен
             перед o2 при сортировке в порядке возрастания длины пароля*/
            return -1;
        } else if (o1.getPassword().length() == o2.getPassword().length()) {
            /* Если длина пароля у объекта o1 равна длине пароля у объекта o2,
             возвращаем 0, чтобы указать, что o1 и o2 равны по длине паролей*/
            return 0;
        } else {
            /* Если длина пароля у объекта o1 больше длины пароля у объекта o2,
            возвращаем 1, чтобы указать, что o1 должен быть расположен
            после o2 при сортировке в порядке возрастания длины пароля*/
            return 1;
        }
    }
}