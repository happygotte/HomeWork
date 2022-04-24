package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumHandler extends PatternHandler implements IHandler {

    private final ICalculator calculator;

    public SumHandler(ICalculator calculator) {
        super(NUMBER_PATTERN + " *\\+ *" + NUMBER_PATTERN);
        this.calculator = calculator;
    }

    @Override
    protected double calc(Matcher matcher) {
        String operand1 = matcher.group(1);
        String operand2 = matcher.group(3);
        return calculator.sum(Double.parseDouble(operand1), Double.parseDouble(operand2));
    }

    @Override
    public int getPriority() {
        return 1;
    }
}
