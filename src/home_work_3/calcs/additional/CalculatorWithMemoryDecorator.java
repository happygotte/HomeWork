package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {

    private ICalculator calculator;
    private double lastOperation;
    private double currentOperation;

    public CalculatorWithMemoryDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    public void setMemory() {
        this.lastOperation = this.currentOperation;
    }

    public double getMemory() {
        double integer = this.lastOperation;
        lastOperation = 0;
        return integer;
    }

    /**
     * Сложение двух чисел
     * @param x число типа double
     * @param y число типа double
     * @return сумма двух чисел
     */
    public double sum(double x, double y) {
        this.currentOperation = calculator.sum(x, y);
        return currentOperation;
    }


    /**
     * Вычитание числа у из числа х
     * @param x число типа double
     * @param y число типа double
     * @return разность двух чисел
     */
    public double subtract(double x, double y) {
        this.currentOperation = calculator.subtract(x, y);
        return currentOperation;
    }

    /**
     * Умножение двух чисел
     * @param x число типа double
     * @param y число типа double
     * @return произведение двух чисел
     */
    public double multiply(double x, double y) {
        this.currentOperation = calculator.multiply(x, y);
        return currentOperation;
    }

    /**
     * Деление числа х на число у
     * @param x число типа double
     * @param y число типа double
     * @return частное от деления
     */
    public double division(double x, double y) {
        this.currentOperation = calculator.division(x, y);
        return currentOperation;
    }

    /**
     * Возведение числа х в степень у
     * @param x число типа double
     * @param y число типа double
     * @return степень числа x
     */
    public double power(double x, double y) {
        this.currentOperation = calculator.power(x, y);
        return currentOperation;
    }

    /**
     * Определение модуля числа
     * @param x число типа double
     * @return модуль числа
     */
    public double absoluteValue(double x) {
        this.currentOperation = calculator.absoluteValue(x);
        return currentOperation;
    }

    /**
     * Извлечение квадратного корня из числа
     * @param x число типа double
     * @return квадраный корень числа
     */
    public double squareRoot(double x) {
        this.currentOperation = calculator.squareRoot(x);
        return currentOperation;
    }

}
