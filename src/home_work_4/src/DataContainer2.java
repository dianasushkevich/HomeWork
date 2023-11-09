package src;

import java.util.Comparator;

public class DataContainer2<T> {
    private Object[] data; // Массив данных, хранящихся в контейнере
    private int size; // Количество элементов в контейнере

    // Конструктор класса - инициализирует массив данных и устанавливает размер в 0
    public DataContainer2() {
        this.data = new Object[10];
        this.size = 0;
    }

    // Метод для добавления элемента в контейнер
    public int add(T item) {
        if (size == data.length) {
            // Если массив заполнен, увеличиваем его размер в два раза
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[size] = item;
        size++;
        return size - 1; // Возвращаем индекс добавленного элемента
    }

    // Метод для удаления элемента из контейнера по индексу
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
        data[size] = null; // Устанавливаем последний элемент в массиве в null
    }

    // Метод для удаления элемента из контейнера по значению
    public void delete(T item) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(item)) {
                delete(i);
                return;
            }
        }
    }

    // Метод для получения элемента из контейнера по индексу
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return (T) data[index];
    }

    // Метод для сортировки элементов в контейнере с использованием заданного компаратора
    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (comparator.compare((T) data[j], (T) data[j + 1]) > 0) {
                    Object temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // Переопределение метода toString для получения строкового представления контейнера
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}