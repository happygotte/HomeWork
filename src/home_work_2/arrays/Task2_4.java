package home_work_2.arrays;
import home_work_2.Utils.ArraysUtils2_1;

import java.util.Arrays;


public class Task2_4 {
    public static void main(String[] args) {
        int[] container = ArraysUtils2_1.arrayRandom(25, 100);

        //System.out.println(Arrays.toString(container));

        System.out.println(sumEven(container));
        System.out.println(maxEven(container));
        System.out.println(lesser(container));
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
        for (int j : container) {
            if (j % 2 == 0 && j > 0) {
                result += j;
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
    public static String lesser(int[] container) {
        int result = 0;
        for (int j : container) {
            result += j;
        }
        int average = result / container.length;

        StringBuilder str = new StringBuilder();
        for (int j : container) {
            if (j < average) {
                str.append(j);
                str.append("; ");
            }
        }
        return "" + str;
    }

    /**
     * Нахождение двух наименьших (минимальных) элемента массива
     * @param container массив чисел
     * @return массив из двух наименьших элементов
     */
    public static int[] twoLesser(int[] container) {
        if (container.length < 2) {
            return container;
        }
        int lesser_num1 = container[0];
        int lesser_num2 = container[1];

        if (container[1] < container[0]) {
            lesser_num2 = container[0];
            lesser_num1 = container[1];
        }

        for (int i = 2; i < container.length; i++) {
            if(container[i] < lesser_num1){
                lesser_num2 = lesser_num1;
                lesser_num1 = container[i];
            }
            else {
                if(container[i] < lesser_num2){
                    lesser_num2 = container[i];
                }
            }
        }
        int[] two_lesser = new int[2];
        two_lesser[0] = lesser_num1;
        two_lesser[1] = lesser_num2;
        return two_lesser;
    }

    /**
     * "Сжатие" массива через удаление элементов, принадлежащих указанному интервалу, и заполнение пустот нулями
     * @param container массив чисел
     * @param lower нижняя граница интервала
     * @param upper верхняя граница интервала
     * @return "сжатый" массив
     */
    public static int[] compressAndFillZeros(int[] container, int lower, int upper) {
        int[] new_container = new int[container.length];
        int count = 0;
        for (int i = 0; i < container.length; i++) {
            if (container[i] >= lower && container[i] <= upper) {
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
        for (int j : container) {
            int num = Math.abs(j);
            while (num != 0) {
                result += num % 10;
                num /= 10;
            }
        }
        return result;
    }
}

