package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    /**
     * Возведение числа х в степень у
     * @param x число типа double
     * @param y число типа double
     * @return степень числа x
     */
    @Override
    public double power(double x, double y) {
        return Math.pow(x, y);
    }

    /**
     * Определение модуля числа
     * @param x число типа double
     * @return модуль числа
     */
    @Override
    public double absoluteValue(double x) {
        return Math.abs(x);
    }

    /**
     * Извлечение квадратного корня из числа
     * @param x число типа double
     * @return квадраный корень числа
     */
    @Override
    public double squareRoot(double x) {
        return Math.sqrt(x);
    }

}
