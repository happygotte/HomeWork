package home_work_2.loops;

public class Task1_1_1 {
    String string;

    public Task1_1_1(String string) {
        this.string = string;
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
     * @param string строка с числом
     * @return строка, отображающая процесс вычисления факториала с результатом
     */
    public static String factorial(String string) {
        if (!isLetter(string)) {
            int num = Integer.parseInt(string);
            if (num > 16) {
                return "Введено слишком большое число";
            }
            int result = 1;
            StringBuilder s = new StringBuilder();
            for (int i = 1; i <= num; i++) {
                result *= i;
                if (i < num) {  // если число не последнее, добавить *
                    s.append(i);
                    s.append(" * ");
                } else {
                    s.append(i);
                }
            }
            return s + " = " + result;
        }
        return "Введены недопустимые данные";
    }
}


