package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {

    private ICalculator calculatorWithMemory;
    private double lastOperation;
    private double currentOperation;

    public CalculatorWithMemory (ICalculator calculator) {
        this.calculatorWithMemory = calculator;
    }

    /**
     * Передача промежуточного результата currentOperation в итоговую переменную lastOperation
     */
    public void setMemory() {
        this.lastOperation = this.currentOperation;
    }

    /**
     * Получение значения итоговой переменной lastOperation и её обнуление
     * @return значение итоговой переменной (результат последней математической операции)
     */
    public double getMemory() {
        double integer = this.lastOperation;
        lastOperation = 0;
        return integer;
    }

    /**
     * Сложение двух чисел и запись результата в промежуточную переменную currentOperation
     * @param x число типа double
     * @param y число типа double
     * @return сумма двух чисел
     */
    public double sum(double x, double y) {
        this.currentOperation = calculatorWithMemory.sum(x, y);
        return currentOperation;
    }

    /**
     * Вычитание числа у из числа х и запись результата в промежуточную переменную currentOperation
     * @param x число типа double
     * @param y число типа double
     * @return разность двух чисел
     */
    public double subtract(double x, double y) {
        this.currentOperation = calculatorWithMemory.subtract(x, y);
        return currentOperation;
    }

    /**
     * Умножение двух чисел и запись результата в промежуточную переменную currentOperation
     * @param x число типа double
     * @param y число типа double
     * @return произведение двух чисел
     */
    public double multiply(double x, double y) {
        this.currentOperation = calculatorWithMemory.multiply(x, y);
        return currentOperation;
    }

    /**
     * Деление числа х на число у и запись результата в промежуточную переменную currentOperation
     * @param x число типа double
     * @param y число типа double
     * @return частное от деления
     */
    public double division(double x, double y) {
        this.currentOperation = calculatorWithMemory.division(x, y);
        return currentOperation;
    }

    /**
     * Возведение числа х в степень у и запись результата в промежуточную переменную currentOperation
     * @param x число типа double
     * @param y число типа double
     * @return степень числа x
     */
    public double power(double x, double y) {
        this.currentOperation = calculatorWithMemory.power(x, y);
        return currentOperation;
    }

    /**
     * Определение модуля числа и запись результата в промежуточную переменную currentOperation
     * @param x число типа double
     * @return модуль числа
     */
    public double absoluteValue(double x) {
        this.currentOperation = calculatorWithMemory.absoluteValue(x);
        return currentOperation;
    }

    /**
     * Извлечение квадратного корня из числа и запись результата в промежуточную переменную currentOperation
     * @param x число типа double
     * @return квадраный корень числа
     */
    public double squareRoot(double x) {
        this.currentOperation = calculatorWithMemory.squareRoot(x);
        return currentOperation;
    }
}
