package home_work_4;

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

        // Вставка данных на свободное место и получение индекса
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                return i;
            }
        }
        // Вставка данных на 0 позицию или в конец массива
        if(this.data.length == 0 || this.data[this.data.length - 1] != null){
            this.data = Arrays.copyOf(this.data, this.data.length + 1);
            this.data[data.length - 1] = item;
            return data.length - 1;
        }
        return -1;
    }

    /**
     * Получение значения по индексу из массива
     * @param index индекс
     * @return значение по индексу
     */
    public T get(int index) {
        if (this.data.length >= index + 1) { // проверка на наличие нужного индекса
            return this.data[index];
        }
        return null;
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
        if (this.data.length < index + 1) { // проверка на наличие нужного индекса
            return false;
        }

        data[index] = null;

        // Перемещение null в конец массива
        for (int i = index+1; i < this.data.length; i++) {
            this.data[i - 1] = this.data[i];
            this.data[i] = null;
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
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i].equals(item)) {
                this.data[i] = null;
                flag = true;
                index = i;
                break;
            }
        }
        if (flag) {
            // Перемещение null в конец массива
            for (int i = index + 1; i < this.data.length; i++) {
                this.data[i - 1] = this.data[i];
                this.data[i] = null;
            }

            // Перезапись массива с уменьшением его размера
            this.data = Arrays.copyOf(this.data, this.data.length - 1);
            return true;
        }
        return false;
    }

    /**
     * Сортировка массива с помощью переданного компаратора
     * @param comparator компаратор
     */
    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < this.data.length-1; i++) {
            boolean flag = false;
            for (int j = i+1; j < this.data.length; j++) {
                if (comparator.compare(this.data[i], this.data[j]) > 0) {
                    T temp = this.data[i];
                    this.data[i] = this.data[j];
                    this.data[j] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
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
