package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();

        double a = calc2.multiply(15, 7);
        double b = calc2.division(28, 5);
        double c = calc2.power(b, 2);
        double d = calc2.sum(4.1, a);
        double res = calc2.sum(d, c);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + res);
    }
}
