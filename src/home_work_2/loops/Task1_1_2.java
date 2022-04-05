package home_work_2.loops;

public class Task1_1_2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println(factorial(num));
    }

    /**
     * Вычисление факториала числа рекурсивным методом
     * @param n число
     * @return факториал числа
     */
    public static int factorial(int n) {
        int result = 1;

        if (n <= 1) {
            System.out.print(" * 1 = ");
            return result;
        }
        else {
            System.out.print(n);
            if (n != 2) {
                System.out.print(" * ");
            }

            result = n * factorial(n-1);
            return result;
        }
    }
}


