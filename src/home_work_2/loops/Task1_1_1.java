package home_work_2.loops;

public class Task1_1_1 {
    public static void main(String[] args) {
        String arg = args[0];

        if (isLetter(arg)) {
            System.out.println("Введено не число");
            return;
        }

        int num = Integer.parseInt(args[0]);

        if (num > 16) { // Проверка на переполнение
            System.out.println("Введено слишком большое число");
            return;
        }

        System.out.println(factorial(num));
    }

    /**
     * Проверка строки на наличие значений, не равных цифре
     * @param string строка
     * @return true в случае наличия значений, не равных цифре, или false в случае наличия только цифр
     */
    public static boolean isLetter(String string) {
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (!Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Вычисление факториала числа
     * @param number целое положительное число
     * @return строка, отображающая процесс вычисления факториала с результатом
     */
    public static String factorial(int number) {
        int result = 1;
        String s = "";
        for (int i = 1; i <= number; i++) {
            result *= i;
            if (i < number) {  // если число не последнее, добавить *
                s += i + " * ";
            } else {
                s += i;
            }
        }
        return s + " = " + result;
    }
}


