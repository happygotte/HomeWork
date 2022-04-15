package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    long counter;

    /**
     * Увеличение счётчика counter на 1 при выполнении каждой математической операции
     */
    public void incrementCountOperation() {
        counter += 1;
    }

    /**
     * Получение текущего значения счётчика counter
     * @return текущее значение счётчика counter
     */
    public long getCountOperation() {
        return counter;
    }

    /**
     * Сложение двух чисел и увеличение счётчика операций
     * @param x число типа double
     * @param y число типа double
     * @return сумма двух чисел
     */
    @Override
    public double sum(double x, double y) {
        incrementCountOperation();
        return super.sum(x, y);
    }

    /**
     * Вычитание числа у из числа х и увеличение счётчика операций
     * @param x число типа double
     * @param y число типа double
     * @return разность двух чисел
     */
    @Override
    public double subtract(double x, double y) {
        incrementCountOperation();
        return super.subtract(x, y);
    }

    /**
     * Умножение двух чисел и увеличение счётчика операций
     * @param x число типа double
     * @param y число типа double
     * @return произведение двух чисел
     */
    @Override
    public double multiply(double x, double y) {
        incrementCountOperation();
        return super.multiply(x, y);
    }

    /**
     * Деление числа х на число у и увеличение счётчика операций
     * @param x число типа double
     * @param y число типа double
     * @return частное от деления
     */
    @Override
    public double division(double x, double y) {
        incrementCountOperation();
        return super.division(x, y);
    }

    /**
     * Возведение числа х в степень у и увеличение счётчика операций
     * @param x число типа double
     * @param y число типа double
     * @return степень числа x
     */
    @Override
    public double power(double x, double y) {
        incrementCountOperation();
        return super.power(x, y);
    }

    /**
     * Определение модуля числа и увеличение счётчика операций
     * @param x число типа double
     * @return модуль числа
     */
    @Override
    public double absoluteValue(double x) {
        incrementCountOperation();
        return super.absoluteValue(x);
    }

    /**
     * Извлечение квадратного корня из числа и увеличение счётчика операций
     * @param x число типа double
     * @return квадраный корень числа
     */
    @Override
    public double squareRoot(double x) {
        incrementCountOperation();
        return super.squareRoot(x);
    }
}
