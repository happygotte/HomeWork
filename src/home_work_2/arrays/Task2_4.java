package home_work_2.arrays;
import home_work_2.Utils.ArraysUtils2_1;

import java.util.Arrays;


public class Task2_4 {
    public static void main(String[] args) {
        int[] container = ArraysUtils2_1.arrayRandom(50, 100);

        System.out.println(sumEven(container));
        System.out.println(maxEven(container));
        lesser(container);
        System.out.println(Arrays.toString(twoLesser(container)));
        System.out.println(Arrays.toString(compressAndFillZeros(container, 60, 80)));
        System.out.println(sumDigits(container));

    }

    /**
     * Нахождение суммы чётных положительных чисел массива
     * @param container массив чисел
     * @return сумма чисел согласно условию
     */
    public static int sumEven(int[] container) {
        int result = 0;
        for (int i = 0; i < container.length; i++) {
            if (container[i] % 2 == 0) {
                result += container[i];
            }
        }
        return result;
    }

    /**
     * Нахождение максимального элемента массива с четным индексом
     * @param container массив чисел
     * @return максимальный элемент
     */
    public static int maxEven(int[] container) {
        int max = container[0];
        for (int i = 0; i < container.length; i += 2) {
            if (container[i] > max) {
                max = container[i];
            }
        }
        return max;
    }

    /**
     * Вывод элементов массива, которые меньше среднего арифметического
     * @param container массив чисел
     */
    public static void lesser(int[] container) {
        int result = 0;
        for (int i = 0; i < container.length; i++) {
            result += container[i];
        }
        int average = result / container.length;

        for (int i = 0; i < container.length; i++) {
            if (container[i] < average) {
                System.out.print(container[i] + "; ");
            }
        }
        System.out.println("\n");
    }

    /**
     * Нахождение двух наименьших (минимальных) элемента массива
     * @param container массив чисел
     * @return массив из двух наименьших элементов
     */
    public static int[] twoLesser(int[] container) {
        int lesser_num1 = container[0];
        int lesser_num2 = container[0];
        for (int i = 0; i < container.length; i++) {
            if (container[i] < lesser_num1) {
                lesser_num2 = lesser_num1;
                lesser_num1 = container[i];
            }
        }
        int[] two_lesser = new int[2];
        two_lesser[0] = lesser_num1;
        two_lesser[1] = lesser_num2;
        return two_lesser;
    }

    /**
     * "Сжатие" массива, удалив элементы, принадлежащие указанному интервалу
     * @param container массив чисел
     * @param lower нижняя граница интервала
     * @param upper верхняя граница интервала
     * @return "сжатый" массив
     */
    public static int[] compressAndFillZeros(int[] container, int lower, int upper) {
        int[] new_container = new int[container.length];
        for (int i = 0; i < new_container.length; i++) {
            new_container[i] = 0;
        }
        int count = 0;
        for (int i = 0; i < container.length; i++) {
            if (container[i] >= lower & container[i] <= upper) {
                count += 1;
                continue;
            }
            new_container[i - count] = container[i];
        }
        return new_container;
    }

    /**
     * Нахождение суммы цифр массива
     * @param container массив чисел
     * @return сумма цифр массива
     */
    public static int sumDigits(int[] container) {
        int result = 0;
        for (int i = 0; i < container.length; i++) {
            int num = container[i];
            while (num != 0) {
                result += num % 10;
                num /= 10;
            }
        }
        return result;
    }
}

