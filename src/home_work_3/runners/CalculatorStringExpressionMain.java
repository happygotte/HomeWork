package home_work_3.runners;

import home_work_3.calcs.adapter.CalculatorStringExpression;

public class CalculatorStringExpressionMain {
    public static void main(String[] args) {

        CalculatorStringExpression calc = new CalculatorStringExpression();

        double result = calc.calc("5 + 8 * 2 * 5");
        System.out.println(result);
    }
}
