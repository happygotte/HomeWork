package home_work_2.loops;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double num;
        System.out.println("Введите число, которое необходимо возвести в степень");
        while (!console.hasNextDouble()) {
            System.out.println("Это не число");
            console.next();
        }
        num = console.nextDouble();


        int pow;
        do {
            System.out.println("Введите положительное значение степени числа");
            while (!console.hasNextInt()) {
                System.out.println("Введите целое число");
                console.next();
            }
            pow = console.nextInt();
        } while (pow < 0);

        double result = 1;
        for (int i = 1; i <= pow ; i++) {
            result *= num;
        }

        System.out.println(num + " ^ " + pow + " = " + result);
    }
}
