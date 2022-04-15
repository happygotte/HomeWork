package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();

        double a = calc3.multiply(15, 7);
        double b = calc3.division(28, 5);
        double c = calc3.power(b, 2);
        double d = calc3.sum(4.1, a);
        double res = calc3.sum(d, c);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + res);
    }
}
