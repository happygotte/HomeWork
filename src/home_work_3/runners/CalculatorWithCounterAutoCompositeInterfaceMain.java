package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAggregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoAggregationInterface calcBest = new CalculatorWithCounterAutoAggregationInterface(new CalculatorWithMathCopy());

        double a = calcBest.multiply(15, 7);
        double b = calcBest.division(28, 5);
        double c = calcBest.power(b, 2);
        double d = calcBest.sum(4.1, a);
        double res = calcBest.sum(d, c);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + res);
        System.out.println("Количество выполненных операций: " + calcBest.getCountOperation());
    }
}
