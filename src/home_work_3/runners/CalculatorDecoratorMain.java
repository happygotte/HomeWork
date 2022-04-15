package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calculator = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        double a = calculator.multiply(15, 7);
        double b = calculator.division(28, 5);
        double c = calculator.power(b, 2);
        double d = calculator.sum(4.1, a);
        double res = calculator.sum(d, c);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + res);

        if (calculator instanceof CalculatorWithCounterAutoDecorator) {
            CalculatorWithCounterAutoDecorator withCounter = (CalculatorWithCounterAutoDecorator) calculator;
            System.out.println("Количество выполненных операций: " + withCounter.getCountOperation());
            if (withCounter.getCalculator() instanceof CalculatorWithMemoryDecorator) {
                CalculatorWithMemoryDecorator withMemory = (CalculatorWithMemoryDecorator) withCounter.getCalculator();
                withMemory.setMemory();
                System.out.println("Последнее сохранённое в памяти значение: " + withMemory.getMemory());
            }
        }
    }
}
