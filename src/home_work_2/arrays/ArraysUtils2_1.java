package home_work_2.arrays;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils2_1 {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        int[] container2 = arrayRandom(5, 100);
    }

    /**
     * создание массива с запрошенными у пользователя данных о размере массива и его элементах
     * @return заполненный массив
     */
    public static int[] arrayFromConsole() {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int size;
        while (!console.hasNextInt()) {
            System.out.println("Это не число");
            console.next();
        }
        size = console.nextInt();

        int[] container = new int[size];

        for (int i = 0; i < container.length; i++) {
            System.out.println("Введите значение ячейки " + (i + 1));
            while (!console.hasNextInt()) {
                System.out.println("Это не число");
                console.next();
            }
            container[i] = console.nextInt();
        }
        return container;
    }

    /**
     * создание массива с заданным размером и рандомно сгенерированными числовыми элементами
     * @param size размер массива
     * @param maxValueExclusion верхний предел генерирования рандомных чисел
     * @return заполненный массив
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] container = new int[size];
        Random rand = new Random();
        for (int i = 0; i < container.length; i++) {
            container[i] = rand.nextInt(maxValueExclusion);
        }
        return container;
    }
}
