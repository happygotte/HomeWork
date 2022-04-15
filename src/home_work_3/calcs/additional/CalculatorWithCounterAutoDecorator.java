package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {

    private ICalculator calculator;
    private long counter;

    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
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

    public ICalculator getCalculator() {
        return calculator;
    }

    @Override
    public double sum(double x, double y) {
        incrementCountOperation();
        return this.calculator.sum(x, y);
    }

    @Override
    public double subtract(double x, double y) {
        incrementCountOperation();
        return this.calculator.subtract(x, y);
    }

    @Override
    public double multiply(double x, double y) {
        incrementCountOperation();
        return this.calculator.multiply(x, y);
    }

    @Override
    public double division(double x, double y) {
        incrementCountOperation();
        return this.calculator.division(x, y);
    }

    @Override
    public double power(double x, double y) {
        incrementCountOperation();
        return this.calculator.power(x, y);
    }

    @Override
    public double absoluteValue(double x) {
        incrementCountOperation();
        return this.calculator.absoluteValue(x);
    }

    @Override
    public double squareRoot(double x) {
        incrementCountOperation();
        return this.calculator.squareRoot(x);
    }
}
