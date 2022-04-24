package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;

import java.util.regex.Matcher; // класс для работы с РВ
import java.util.regex.Pattern; // класс для работы с РВ

public abstract class PatternHandler implements IHandler {

    public static final String NUMBER_PATTERN = "(\\d{1,}(\\.\\d{1,}){0,1})";
    private final Pattern pattern; //класс Pattern не имеет публичных конструкторов, поэтому его объект создаётся иначе

    public PatternHandler(String regexp) { // конструктор абстр.класса, в котором созадаётся объект Pattern
        this.pattern = Pattern.compile(regexp); // объект Pattern через статич.метод, в который передана строка
    }

    @Override
    public final String handle(String expression) {
        boolean isMatch = false;
        do {
            Matcher matcher = this.pattern.matcher(expression); // не имеет публичных конструкторов, поэтому для создания объекта этого класса нужно использовать метод matcher класса Pattern
            isMatch = matcher.find(); // пытается найти подстроку, которая удовлетворяет РВ
            if (isMatch) {
                double result = calc(matcher); // просчитывается в хэндлерах
                do {
                    expression = expression.replace(matcher.group(), String.valueOf(result));
                } while (expression.contains(matcher.group()));
            }
        } while (isMatch);

        return expression;
    }

    protected abstract double calc(Matcher matcher);

}
