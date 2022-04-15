package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAggregation {
    private CalculatorWithMathCopy calc_1;
    private CalculatorWithMathExtends calc_2;
    private CalculatorWithOperator calc_3;
    private long counter;

    public CalculatorWithCounterAutoAggregation (CalculatorWithMathCopy calculator) {
        this.calc_1 = calculator;
    }

    public CalculatorWithCounterAutoAggregation (CalculatorWithMathExtends calculator) {
        this.calc_2 = calculator;
    }

    public CalculatorWithCounterAutoAggregation (CalculatorWithOperator calculator) {
        this.calc_3 = calculator;
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
     * Сложение двух чисел  и увеличение счётчика операций
     * @param x число типа double
     * @param y число типа double
     * @return сумма двух чисел
     */
    public double sum(double x, double y) {
        incrementCountOperation();
        if (calc_1 != null) {
            return calc_1.sum(x, y);
        } else if (calc_2 != null) {
            return calc_2.sum(x, y);
        } else {
            return calc_3.sum(x, y);
        }
    }

    /**
     * Вычитание числа у из числа х и увеличение счётчика операций
     * @param x число типа double
     * @param y число типа double
     * @return разность двух чисел
     */
    public double subtract(double x, double y) {
        incrementCountOperation();
        if (calc_1 != null) {
            return calc_1.subtract(x, y);
        } else if (calc_2 != null) {
            return calc_2.subtract(x, y);
        } else {
            return calc_3.subtract(x, y);
        }
    }

    /**
     * Умножение двух чисел и увеличение счётчика операций
     * @param x число типа double
     * @param y число типа double
     * @return произведение двух чисел
     */
    public double multiply(double x, double y) {
        incrementCountOperation();
        if (calc_1 != null) {
            return calc_1.multiply(x, y);
        } else if (calc_2 != null) {
            return calc_2.multiply(x, y);
        } else {
            return calc_3.multiply(x, y);
        }
    }

    /**
     * Деление числа х на число у и увеличение счётчика операций
     * @param x число типа double
     * @param y число типа double
     * @return частное от деления
     */
    public double division(double x, double y) {
        incrementCountOperation();
        if (calc_1 != null) {
            return calc_1.division(x, y);
        } else if (calc_2 != null) {
            return calc_2.division(x, y);
        } else {
            return calc_3.division(x, y);
        }
    }

    /**
     * Возведение числа х в степень у и увеличение счётчика операций
     * @param x число типа double
     * @param y число типа double
     * @return степень числа x
     */
    public double power(double x, double y) {
        incrementCountOperation();
        if (calc_1 != null) {
            return calc_1.power(x, y);
        } else if (calc_2 != null) {
            return calc_2.power(x, y);
        } else {
            return calc_3.power(x, y);
        }
    }

    /**
     * Определение модуля числа и увеличение счётчика операций
     * @param x число типа double
     * @return модуль числа
     */
    public double absoluteValue(double x) {
        incrementCountOperation();
        if (calc_1 != null) {
            return calc_1.absoluteValue(x);
        } else if (calc_2 != null) {
            return calc_2.absoluteValue(x);
        } else {
            return calc_3.absoluteValue(x);
        }
    }

    /**
     * Извлечение квадратного корня из числа и увеличение счётчика операций
     * @param x число типа double
     * @return квадраный корень числа
     */
    public double squareRoot(double x) {
        incrementCountOperation();
        if (calc_1 != null) {
            return calc_1.squareRoot(x);
        } else if (calc_2 != null) {
            return calc_2.squareRoot(x);
        } else {
            return calc_3.squareRoot(x);
        }
    }
}
