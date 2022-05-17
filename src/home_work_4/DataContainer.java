package home_work_4;

import home_work_4.comparators.ComparatorComparable;

import java.util.Comparator;
import java.util.Arrays;


public class DataContainer<T> {

    private T[] data;

    /**
     * конструктор, принимающий массив
     * @param init массив
     */
    public DataContainer(T[] init) {
        this.data = init;
    }

    /**
     * Добавление элементов в массив с перезаписью массива в случае его увеличения
     * @param item элемент
     * @return индекс, соответствующий добавленному элементу
     */
    public int add(T item) {
        if (item == null) {
            return -1;
        }

        int index = -1;

        // Вставка данных на свободное место и получение индекса
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                index = i;
                break;
            }
        }
        // Вставка данных на 0 позицию или в конец массива
        if(index == -1) {
            index = this.data.length;
            this.data = Arrays.copyOf(this.data, this.data.length + 1);
        }
        this.data[index] = item;

        return index;
    }

    /**
     * Проверка передаваемого индекса на соответствие размеру массива
     * @param index индекс
     * @return true, если такой индекс есть в массиве; false, если такого индекса нет
     */
    private boolean checkIndex(int index) {
        return index >= 0 && index < this.data.length;
    }

    /**
     * Получение значения по индексу из массива
     * @param index индекс
     * @return значение по индексу
     */
    public T get(int index) {
        if(!checkIndex(index)) {
            return null;
        }
        return this.data[index];
    }

    /**
     * Получение всего массива
     * @return массив целиком
     */
    public T[] getItems() {
        return this.data;
    }

    /**
     * Удаление элемента из массива по индексу
     * @param index индекс, по которому нужно удалить элемент
     * @return true в случае успешного удаления, false в случае отсутствия индекса в массиве
     */
    public boolean delete(int index) {
        if (!checkIndex(index)) { // проверка на наличие нужного индекса
            return false;
        }

        for (int i = index+1; i < this.data.length; i++) {
            this.data[i - 1] = this.data[i];
        }

        // Перезапись массива с уменьшением его размера
        this.data = Arrays.copyOf(this.data, this.data.length - 1);
        return true;
    }

    /**
     * Удаление элемента из массива по значению
     * @param item значение, которое нужно удалить
     * @return true в случае успешного удаления, false в случае отсутствия значения в массиве
     */
    public boolean delete(T item) {
        if (item == null) {
            return false;
        }
        for (int i = 0; i < this.data.length; i++) {
            if (item.equals(this.data[i])) {
                return delete(i);
            }

        }
        return false;
    }

    /**
     * Сортировка массива с помощью переданного компаратора
     * @param comparator компаратор
     */
    public void sort(Comparator<T> comparator) {
        sort(this, comparator);
    }

    /**
     * Сортировка переданного массива с помощью метода compareTo
     * @param container массив, который необходимо сортировать
     * @param <T> переменная типа, ограниченная Comparable
     */
    public static <T extends Comparable<T>> void sort(DataContainer <T> container){
        sort(container, new ComparatorComparable<>());
    }

    /**
     * Сортировка переданного массива с помощью передаваемого компаратора
     * @param container массив, который необходимо сортировать
     * @param comparator передаваемый компаратор
     * @param <T> переменная типа
     */
    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator) {
        for (int i = 0; i < container.data.length-1; i++) {
            for (int j = i+1; j < container.data.length; j++) {
                if (comparator.compare(container.data[i], container.data[j]) > 0) {
                    T temp = container.data[i];
                    container.data[i] = container.data[j];
                    container.data[j] = temp;
                }
            }
        }

    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] != null) {
                if (i != 0) {
                    s.append(", ");
                }
                s.append(this.data[i]);
            }
        }
        return "[" + s + "]";
    }

    @Override
    public int hashCode() { //
        return Arrays.hashCode(data);
    }

    @Override
    public boolean equals(Object obj) { //
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        DataContainer<?> dataContainer = (DataContainer<?>) obj;
        return dataContainer.data == this.data;
    }
}
