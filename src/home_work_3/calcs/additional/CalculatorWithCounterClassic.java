package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

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
}
