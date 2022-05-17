package home_work_4;

import home_work_4.comparators.ComparatorInteger;
import java.util.Arrays;

import static home_work_4.DataContainer.sort;


public class DataContainerMain<T> {
    public static void main(String[] args) {
        // Объект типа String
        DataContainer<String> container = new DataContainer<>(new String[0]);

        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");

        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);

        container.delete(text1); // Удаление элемента по значению
        System.out.println(container); // toString работает, удаление состоялось
        System.out.println(container.get(index1)); //Как дела

        // Объект типа Integer
        DataContainer<Integer> container1 = new DataContainer<>(new Integer[]{5, null, 1, 999});

        System.out.println(container1.add(3)); // Вставка нового элемента на пустующее место и получение индекса
        System.out.println("Container1 before: " + container1);

        container1.sort(new ComparatorInteger()); // Сортировка
        System.out.println("Container1 after: " + Arrays.toString(container1.getItems())); // [1, 3, 5, 999]

        System.out.println(container1.delete(0)); // true, удаление объекта по существующему индексу
        System.out.println(container1);
        System.out.println(container1.delete(8)); // false, удаление объекта по несуществующему индексу
        System.out.println(container1);

        container1.add(null); // Попытка добавить значение null
        System.out.println(container1); // Без изменений

        // Вызов дженерик-метода sort (11*)
        DataContainer<String> container2 = new DataContainer<>(new String[]{"believe", "win", "can"});
        System.out.println("Container2 before: " + container2);
        sort(container2); // Сортировка
        System.out.println("Container2 after: " + container2); // ["believe", "can", "win"]

        // Проверка на null в массиве
        DataContainer<String> containerWithNull = new DataContainer<>(new String[]{"believe", null, "can"});
        sort(containerWithNull); // Сортировка

        // Вызов дженерик-метода sort с компаратором (12*)
        DataContainer<Integer> container3 = new DataContainer<>(new Integer[]{5, 3, 1, 999});
        System.out.println("Container3 before: " + container3);
        sort(container3, new ComparatorInteger()); // Сортировка
        System.out.println("Container3 after: " + container3); // [1, 3, 5, 999]













    }


}
