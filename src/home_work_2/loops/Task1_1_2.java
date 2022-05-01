package home_work_2.loops;

public class Task1_1_2 {

    /**
     * Вычисление факториала числа рекурсивным методом
     * @param num число
     * @return факториал числа
     */
    public static int factorial(int num) {
        if(num < 0) {
            System.out.println("Введено отрицательное число");
            return 0;
        }
        if (num > 16) {
            System.out.println("Введено слишком большое число");
            return 0;
        }
        int result = 1;
        if (num <= 1) {
            System.out.print(" * 1 = ");
            return result;
        } else {
            System.out.print(num);
            if (num != 2) {
                System.out.print(" * ");
            }
            result = num * factorial(num-1);
            return result;
        }
    }
}


