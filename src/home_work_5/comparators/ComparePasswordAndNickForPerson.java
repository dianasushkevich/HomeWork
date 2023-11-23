package comparators;
import DTO.Person;
import java.util.Comparator;

public class ComparePasswordAndNickForPerson implements Comparator<Person> {
    @Override
    // Метод сравнивает пароль и ник двух людей
    public int compare(Person o1, Person o2) {
        // Если длина пароля первого человека меньше длины пароля второго человека, возвращаем -1
        if (o1.getPassword().length() < o2.getPassword().length()) {
            return -1;
        }
        // Если длина пароля первого человека равна длине пароля второго человека, сравниваем их ники
        else if (o1.getPassword().length() == o2.getPassword().length()) {
            return o1.getNick().compareTo(o2.getNick());
        }
        // Если длина пароля первого человека больше длины пароля второго человека, возвращаем 1
        else {
            return 1;
        }
    }
}