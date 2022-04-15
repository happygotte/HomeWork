package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAggregationInterface {

    private ICalculator calcInterface;
    private long counter;

    public CalculatorWithCounterAutoAggregationInterface(ICalculator calculator) {
        this.calcInterface = calculator;
    }

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
    public double sum(double x, double y) {
        incrementCountOperation();
        return calcInterface.sum(x, y);
    }

    /**
     * Вычитание числа у из числа х и увеличение счётчика операций
     * @param x число типа double
     * @param y число типа double
     * @return разность двух чисел
     */
    public double subtract(double x, double y) {
        incrementCountOperation();
        return calcInterface.subtract(x, y);
    }

    /**
     * Умножение двух чисел и увеличение счётчика операций
     * @param x число типа double
     * @param y число типа double
     * @return произведение двух чисел
     */
    public double multiply(double x, double y) {
        incrementCountOperation();
        return calcInterface.multiply(x, y);
    }

    /**
     * Деление числа х на число у и увеличение счётчика операций
     * @param x число типа double
     * @param y число типа double
     * @return частное от деления
     */
    public double division(double x, double y) {
        incrementCountOperation();
        return calcInterface.division(x, y);
    }

    /**
     * Возведение числа х в степень у и увеличение счётчика операций
     * @param x число типа double
     * @param y число типа double
     * @return степень числа x
     */
    public double power(double x, double y) {
        incrementCountOperation();
        return calcInterface.power(x, y);
    }

    /**
     * Определение модуля числа и увеличение счётчика операций
     * @param x число типа double
     * @return модуль числа
     */
    public double absoluteValue(double x) {
        incrementCountOperation();
        return calcInterface.absoluteValue(x);
    }

    /**
     * Извлечение квадратного корня из числа и увеличение счётчика операций
     * @param x число типа double
     * @return квадраный корень числа
     */
    public double squareRoot(double x) {
        incrementCountOperation();
        return calcInterface.squareRoot(x);
    }
}
