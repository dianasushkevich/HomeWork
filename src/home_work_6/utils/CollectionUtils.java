package utils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionUtils {

    /**
     * Заполняет коллекцию Map элементами из коллекции List. В качестве ключа используются cтроки, в качестве значени -
     * количество повторений ключей
     *
     * @param list Коллекция List
     * @return Коллекция Map
     */
    public static Map<String, Integer> listToMap(List<String> list) {

        Map<String, Integer> map = new HashMap<>();

        for (String word : list) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        return map;
    }

    /**
     * Генерирует и возвращает строку с заданным количеством первых элементов из переданной коллекции в формате
     * "(Ключ) - (Значение) раз\n"
     *
     * @param <K>    Тип ключа
     * @param <V>    Тип значения
     * @param list   Переданная коллекция Entry
     * @param number Количество элементов для добавления в строку
     * @return Строка с информацией об элементах коллекции
     */
    public static <K, V> String getFirstElementsFromList(List<Map.Entry<K, V>> list, int number) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < number; i++) {

            Map.Entry<K, V> temp = list.get(i);

            builder.append(temp.getKey());
            builder.append(" - ");
            builder.append(temp.getValue());
            builder.append(" раз");

            if (i != number - 1) {
                builder.append("\n");
            }
        }
        return builder.toString();
    }
}