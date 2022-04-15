package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoSuper calc5 = new CalculatorWithCounterAutoSuper();

        double a = calc5.multiply(15, 7);
        double b = calc5.division(28, 5);
        double c = calc5.power(b, 2);
        double d = calc5.sum(4.1, a);
        double res = calc5.sum(d, c);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + res);
        System.out.println("Количество выполненных операций: " + calc5.getCountOperation());
    }
}
