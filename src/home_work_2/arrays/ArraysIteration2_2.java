package home_work_2.arrays;

import home_work_2.Utils.ArraysUtils2_1;

public class ArraysIteration2_2 {
    public static void main(String[] args) {
        int[] container = ArraysUtils2_1.arrayFromConsole();
        allElem(container);
        oddElem(container);
        reverse(container);
    }

    /**
     * Вывод в консоль всех элементов массива
     * @param container массив чисел
     */
    public static void allElem(int[] container) {
        int i = 0;
        do {
            System.out.print((i + 1) + " элемент" + " = " + container[i] + "; ");
            i++;
        } while (i < container.length);
        System.out.print("\n");

        int j = 0;
        while (j < container.length) {
            System.out.print((j + 1) + " элемент" + " = " + container[j] + "; ");
            j++;
        }
        System.out.print("\n");

        for (int k = 0; k < container.length; k++) {
            System.out.print((k + 1) + " элемент" + " = " + container[k] + "; ");
        }
        System.out.print("\n");

        int x = 1;
        for (int l : container) {
            System.out.print(x + " элемент" + " = " + l + "; ");
            x++;
        }
        System.out.println("\n");
    }

    /**
     * Вывод в консоль каждого второго элемента массива
     * @param container массив чисел
     */
    public static void oddElem(int[] container) {

        if (container.length > 1) {
            int i = 1;
            do {
                if (i % 2 == 1) {
                    System.out.print((i + 1) + " элемент" + " = " + container[i] + "; ");
                }
                i++;
            } while (i < container.length);
            System.out.print("\n");


            int j = 1;
            while (j < container.length) {
                if (j % 2 == 1) {
                    System.out.print((j + 1) + " элемент" + " = " + container[j] + "; ");
                }
                j++;
            }
            System.out.print("\n");


            for (int k = 0; k < container.length; k++) {
                if (k % 2 == 1) {
                    System.out.print((k + 1) + " элемент" + " = " + container[k] + "; ");
                }
            }
            System.out.print("\n");

            int x = 1;
            for (int l : container) {
                if (x % 2 == 0) {
                    System.out.print(x + " элемент" + " = " + l + "; ");
                }
                x++;
            }
            System.out.println("\n");


        } else {
            System.out.print("Недостаточно элементов в массиве");
            System.out.println("\n");
        }
    }

    /**
     * Вывод на консоль элементов массива в обратном порядке
     * @param container массив чисел
     */
    public static void reverse(int[] container) {
        int i = container.length-1;
        do {
            System.out.print((i + 1) + " элемент" + " = " + container[i] + "; ");
            i--;
        } while (i > -1);
        System.out.print("\n");

        int j = container.length-1;
        while (j > -1) {
            System.out.print((j + 1) + " элемент" + " = " + container[j] + "; ");
            j--;
        }
        System.out.print("\n");

        for (int k = container.length-1; k > -1; k--) {
            System.out.print((k + 1) + " элемент" + " = " + container[k] + "; ");
        }
        System.out.print("\n");

        int x = 1;
        String result = "";
        for (int l : container) {
            result = x + " элемент" + " = " + l + "; " + result;
            x++;
        }
        System.out.print(result);
        System.out.println("\n");
    }
}
