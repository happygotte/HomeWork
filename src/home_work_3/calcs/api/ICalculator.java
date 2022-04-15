package home_work_3.calcs.api;

public interface ICalculator {

    /**
     * Сложение двух чисел
     * @param x число типа double
     * @param y число типа double
     * @return сумма двух чисел
     */
    double sum(double x, double y);

    /**
     * Вычитание числа у из числа х
     * @param x число типа double
     * @param y число типа double
     * @return разность двух чисел
     */
    double subtract(double x, double y);

    /**
     * Умножение двух чисел
     * @param x число типа double
     * @param y число типа double
     * @return произведение двух чисел
     */
    double multiply(double x, double y);

    /**
     * Деление числа х на число у
     * @param x число типа double
     * @param y число типа double
     * @return частное от деления
     */
    double division(double x, double y);

    /**
     * Возведение числа х в степень у
     * @param x число типа double
     * @param y числоа типа double
     * @return степень числа x
     */
    double power(double x, double y);

    /**
     * Определение модуля числа
     * @param x число типа double
     * @return модуль числа
     */
    double absoluteValue(double x);

    /**
     * Извлечение квадратного корня из числа
     * @param x число типа double
     * @return квадраный корень числа
     */
    double squareRoot(double x);
}
