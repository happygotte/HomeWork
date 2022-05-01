package home_work_2.loops;

public class Task1_2 {

    /**
     * Проверка массива символов на буквенные значения
     * @param array массив символов
     * @return true в случае наличия буквенных символов в массиве, false в случае их отсутствия
     */
    public boolean isAlpha(char[] array) {
        for (char c : array) {
            if (Character.isAlphabetic(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Подсчёт количества числовых значений в массиве символов
     * @param array массив символов
     * @return количество числовых значений
     */
    public int digitCount(char[] array) {
        int digit = 0;
        for (char c : array) {
            if (Character.isDigit(c)) {
                digit += 1;
            }
        }
        return digit;
    }

    /**
     * Подсчёт количества символов '.' или ',' в массиве символов
     * @param array массив символов
     * @return количество символов '.' или ','
     */
    public int pointCount(char[] array) {
        int point = 0;
        for (char c : array) {
            if (c == '.' || c == ',') { // является ли символ точкой
                point += 1;
            }
        }
        return point;
    }

    /**
     * Преобразование переданной строки в массив символов, его проверка и перемножение чисел при их наличии
     * с выводом результата в виде строки
     * @param string строка
     * @return строковое отображение процесса перемножения чисел и его результат либо иные сообщения
     */
    public String multiply(String string) {
        char[] array = string.toCharArray();

        if (!isAlpha(array)) {
            // если это целое число

            if (digitCount(array) == array.length) {
                int[] arrayDigit = new int[array.length];
                for (int i = 0; i < array.length; i++) { // преобразование массива символов в массив чисел
                    arrayDigit[i] = Character.getNumericValue(array[i]);
                }

                int result = 1;
                StringBuilder s = new StringBuilder();
                for (int i = 0; i < arrayDigit.length; i++) { // перемножение чисел
                    result *= arrayDigit[i];
                    if (result % arrayDigit[i] != 0 || result == 0) {  // проверка на переполнение с прерыванием цикла
                        return "Произошло переполнение";
                    }
                    if (i < arrayDigit.length-1) {  // если число не последнее, добавить *
                        s.append(arrayDigit[i]).append(" * ");
                    } else {
                        s.append(arrayDigit[i]);
                    }
                }
                return s + " = " + result;

            // если дробное число
            } else {
                if (pointCount(array) == 1) { // нет проверки на точку/запятую в начале
                    return "Введено не целое число";
                }
            }
        }
        return "Введено не число";
    }
}

