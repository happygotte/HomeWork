package home_work_2.loops;

public class Task1_2 {

    public static void main(String[] args) {
        char[] array = args[0].toCharArray();
        int digit = 0;
        int pointCount = 0;
        // исключаем строку и ищем точку/запятую
        for (int i = 0; i < array.length; i++) { // поиск букв среди символов
            if (Character.isAlphabetic(array[i])) {
                System.out.println("Введено не число");
                break;
            }
            if (Character.isDigit(array[i])) { // подсчёт числовых значений
                digit += 1;
            }
            if (array[i] == '.' || array[i] == ',') { // является ли символ точкой
                pointCount += 1;
            }
        }

        // если это целое число
        if (digit == array.length) {
            int[] arrayDigit = new int[array.length];
            for (int i = 0; i < array.length; i++) { // преобразование массива символов в массив чисел
                arrayDigit[i] = Character.getNumericValue(array[i]);
            }

            int result = 1;
            String s = "";
            for (int i = 1; i < arrayDigit.length; i++) { // перемножение чисел
                result *= arrayDigit[i];
                if (result % arrayDigit[i] != 0 || result == 0) {  // проверка на переполнение с прерыванием цикла
                    System.out.println("Произошло переполнение");
                    return;
                }
                if (i < arrayDigit.length-1) {  // если число не последнее, добавить *
                    s += i + " * ";
                } else {
                    s += i;
                }
            }
            System.out.println(s + " = " + result);

        } else {
            if (pointCount == 1) { // нет проверки на точку/запятую в начале
                System.out.println("Введено не целое число");
            } else if ((pointCount > 1)) {
                System.out.println("Некорректный ввод");
            }
        }
    }
}

