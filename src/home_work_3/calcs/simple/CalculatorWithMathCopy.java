package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    /**
     * Сложение двух чисел
     * @param x число типа double
     * @param y число типа double
     * @return сумма двух чисел
     */
    public double sum(double x, double y) {
        return x + y;
    }

    /**
     * Вычитание числа у из числа х
     * @param x число типа double
     * @param y число типа double
     * @return разность двух чисел
     */
    public double subtract(double x, double y) {
        return x - y;
    }

    /**
     * Умножение двух чисел
     * @param x число типа double
     * @param y число типа double
     * @return произведение двух чисел
     */
    public double multiply(double x, double y) {
        return x * y;
    }

    /**
     * Деление числа х на число у
     * @param x число типа double
     * @param y число типа double
     * @return частное от деления
     */
    public double division(double x, double y) {
        return (double) x / y;
    }

    /**
     * Возведение числа х в степень у
     * @param x число типа double
     * @param y числоа типа double
     * @return степень числа x
     */
    public double power(double x, double y) {
        return Math.pow(x, y);
    }

    /**
     * Определение модуля числа
     * @param x число типа double
     * @return модуль числа
     */
    public double absoluteValue(double x) {
        return Math.abs(x);
    }

    /**
     * Извлечение квадратного корня из числа
     * @param x число типа double
     * @return квадраный корень числа
     */
    public double squareRoot(double x) {
        return Math.sqrt(x);
    }
}
