package home_work_2.loops;

public class Task1_3 {

    /**
     * Возведение в степень
     * @param num возводимое число типа double
     * @param pow степень, в которую должно быть возведено число, тип int
     * @return строка, отображающая процесс возведения числа в степень и результат
     */
    public String power(double num, int pow) {
        if (pow > 0) {
            double result = 1;
            for (int i = 1; i <= pow ; i++) {
                result *= num;
            }
            return num + " ^ " + pow + " = " + result;
        }
        return "Степень числа должна быть положительной";
    }
}
