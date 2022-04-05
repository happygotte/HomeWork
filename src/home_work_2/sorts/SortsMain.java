package home_work_2.sorts;

import home_work_2.Utils.SortsUtils;
import home_work_2.Utils.ArraysUtils2_1;
import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,1,1,1};
        int[] arr3 = {9,1,5,99,9,9};
        int[] arr4 = {};
        int[] arr5 = {6,5,4,3,2,1};

        print(arr1);
        print(arr2);
        print(arr3);
        print(arr4);
        print(arr5);

        int[] arrRand = ArraysUtils2_1.arrayRandom(5, 100);
        print(arrRand);

        int[] arrCons = ArraysUtils2_1.arrayFromConsole();
        print(arrCons);
    }

    /**
     * Вывод на консоль массива чисел в первоначальном и отсортированном виде
     * @param array массив чисел
     */
    public static void print(int[] array) {
        System.out.println("Первоначальный вид массива: " + Arrays.toString(array));
        SortsUtils.shake(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
        System.out.println("\n");
    }
}

