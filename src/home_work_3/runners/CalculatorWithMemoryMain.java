package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.additional.CalculatorWithMemory;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculatorWithMemory = new CalculatorWithMemory(new CalculatorWithMathCopy());

        calculatorWithMemory.division(28, 5);
        calculatorWithMemory.setMemory();
        calculatorWithMemory.power(calculatorWithMemory.getMemory(), 2);
        calculatorWithMemory.setMemory();
        calculatorWithMemory.sum(calculatorWithMemory.getMemory(), calculatorWithMemory.multiply(15,7));
        calculatorWithMemory.setMemory();
        calculatorWithMemory.sum(calculatorWithMemory.getMemory(), 4.1);
        calculatorWithMemory.setMemory();
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calculatorWithMemory.getMemory());
    }
}
