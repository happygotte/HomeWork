package home_work_3.calcs.adapter;

import home_work_3.calcs.adapter.handlers.SumHandler;
import home_work_3.calcs.adapter.handlers.MultHandler;
import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

import java.util.PriorityQueue;

public class CalculatorStringExpression {
    private final ICalculator calculator;
    private final PriorityQueue<IHandler> queueHandler = new PriorityQueue<>(
            (o1, o2) -> o2.getPriority() - o1.getPriority()
    );

    public CalculatorStringExpression() {
        this.calculator = new CalculatorWithMathExtends();
        this.queueHandler.add(new MultHandler(this.calculator));
        this.queueHandler.add(new SumHandler(this.calculator));
    }

    public double calc(String expression) {
        for (IHandler handler : queueHandler) {
            expression = handler.handle(expression);
        }
        return Double.parseDouble(expression);
    }




}
