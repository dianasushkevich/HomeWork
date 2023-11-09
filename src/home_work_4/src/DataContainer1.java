package src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DataContainer1<T> implements Iterable<T> {
    private T[] data;
    private int size;

    // Конструктор класса
    public DataContainer1(T[] data) {
        this.data = data;
        this.size = data.length;
    }

    // Метод для добавления элемента в контейнер
    public int add(T item) {
        if (size < data.length) {
            data[size++] = item;
        } else {
            data = Arrays.copyOf(data, size + 1);
            data[size++] = item;
        }
        return size - 1;
    }

    // Метод для получения элемента по индексу
    public T get(int index) {
        if (index >= 0 && index < size) {
            return data[index];
        }
        return null;
    }

    // Метод для получения всех элементов контейнера в виде массива
    public T[] getItems() {
        return Arrays.copyOf(data, size);
    }

    // Метод для удаления элемента по индексу
    public boolean delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            size--;
            return true;
        }
        return false;
    }

    // Метод для удаления элемента из контейнера
    public boolean delete(T item) {
        if (item == null) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (data[i] != null && data[i].equals(item)) {
                for (int j = i; j < size - 1; j++) {
                    data[j] = data[j + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    // Метод для сортировки элементов контейнера с помощью переданного компаратора
    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (comparator.compare(data[j], data[j + 1]) > 0) {
                    T temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // Статический метод для сортировки контейнера с использованием естественного порядка сортировки
    public static <S extends Comparable<S>> void sort(DataContainer1<S> container) {
        container.sort(new Comparator<S>() {
            @Override
            public int compare(S obj1, S obj2) {
                return obj1.compareTo(obj2);
            }
        });
    }

    // Статический метод для сортировки контейнера с использованием пользовательского компаратора
    public static <U> void sort(DataContainer1<U> container, Comparator<U> comparator) {
        container.sort(comparator);
    }

    // Метод для создания итератора
    @Override
    public Iterator<T> iterator() {
        return new DataContainerIterator<>();
    }

    // Приватный класс-итератор для перебора элементов контейнера
    private class DataContainerIterator<T> implements Iterator<T> {
        private int currentIndex = 0;

        // Метод для проверки наличия следующего элемента
        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        // Метод для получения следующего элемента
        @Override
        public T next() {
            if (hasNext()) {
                return (T) data[currentIndex++];
            }
            throw new NoSuchElementException();
        }
    }
}