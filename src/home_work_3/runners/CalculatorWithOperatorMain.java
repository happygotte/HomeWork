package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc1 = new CalculatorWithOperator();

        double a = calc1.multiply(15, 7);
        double b = calc1.division(28, 5);
        double c = calc1.power(b, 2);
        double d = calc1.sum(4.1, a);
        double res = calc1.sum(d, c);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + res);
    }
}
