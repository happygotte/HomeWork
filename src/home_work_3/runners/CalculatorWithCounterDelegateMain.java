package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAggregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calcComposite = new CalculatorWithCounterAutoComposite();

        double a = calcComposite.multiply(15, 7);
        double b = calcComposite.division(28, 5);
        double c = calcComposite.power(b, 2);
        double d = calcComposite.sum(4.1, a);
        double res = calcComposite.sum(d, c);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + res);
        System.out.println("Количество выполненных операций: " + calcComposite.getCountOperation());

        CalculatorWithCounterAutoAggregation calcAggregation = new CalculatorWithCounterAutoAggregation(new CalculatorWithMathCopy());

        double e = calcAggregation.multiply(15, 7);
        double f = calcAggregation.division(28, 5);
        double j = calcAggregation.power(f, 2);
        double i = calcAggregation.sum(4.1, e);
        double res2 = calcAggregation.sum(i, j);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + res2);
        System.out.println("Количество выполненных операций: " + calcAggregation.getCountOperation());

    }
}
