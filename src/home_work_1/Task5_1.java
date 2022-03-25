package home_work_1;

import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите своё имя");
        String name = in.nextLine();

        if (name.equals("Вася") | name.equals("Анастасия")) {
            if (name.equals("Вася")) {
                System.out.println("Привет!");
            }
            System.out.println("Я тебя так долго ждал");
        }

        if (!name.equals("Анастасия") & !name.equals("Вася")) {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
