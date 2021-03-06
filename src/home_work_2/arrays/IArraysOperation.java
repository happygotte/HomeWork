package home_work_2.arrays;

public interface IArraysOperation {

    /**
     * Вывод в консоль всех элементов массива
     *
     * @param container массив чисел
     */
    String allElem(int[] container);


    /**
     * Вывод в консоль каждого второго элемента массива
     *
     * @param container массив чисел
     */
    String oddElem(int[] container);


    /**
     * Вывод на консоль элементов массива в обратном порядке
     *
     * @param container массив чисел
     */
    String reverse(int[] container);
}