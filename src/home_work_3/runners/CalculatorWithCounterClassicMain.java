package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc4 = new CalculatorWithCounterClassic();

        double a = calc4.multiply(15, 7);
        calc4.incrementCountOperation();
        double b = calc4.division(28, 5);
        calc4.incrementCountOperation();
        double c = calc4.power(b, 2);
        calc4.incrementCountOperation();
        double d = calc4.sum(4.1, a);
        calc4.incrementCountOperation();
        double res = calc4.sum(d, c);
        calc4.incrementCountOperation();

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + res);
        System.out.println("Количество выполненных операций: " + calc4.getCountOperation());
    }
}

