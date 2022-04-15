RUNNERS
1. WithoutCalculatorMain - подсчёт без использования калькулятора
2.5. CalculatorWithOperatorMain - создание экземпляра калькулятора CalculatorWithOperator
3.3. CalculatorWithMathCopyMain - создание экземпляра калькулятора CalculatorWithMathCopy 
4.4. CalculatorWithMathExtendsMain - создание экземпляра калькулятора CalculatorWithMathExtends
5.5. CalculatorWithCounterClassicMain - создание экземпляра калькулятора CalculatorWithCounterClassic
6.5. CalculatorWithCounterAutoSuperMain - создание экземпляра калькулятора CalculatorWithCounterAutoSuper
7.7. CalculatorWithCounterDelegateMain - создание экземпляров калькуляторов CalculatorWithCounterAutoComposite и CalculatorWithCounterAutoAgregation
9.7. CalculatorWithCounterAutoCompositeInterfaceMain - создание экземпляра калькулятора CalculatorWithCounterAutoAgregationInterface
10.7.* CalculatorWithMemoryMain - создание экземпляра калькулятора CalculatorWithMemory 
11.5.* CalculatorDecoratorMain - создание экземпляра класса-декоратора CalculatorWithCounterAutoDecorator с переданным в конструктор экземпляром класса CalculatorWithMemoryDecorator, которому, свою очередь, передан в конструктор экземпляр класса CalculatorWithMathExtends

SIMPLE
2. CalculatorWithOperator - калькулятор без библиотеки Math (кроме метода sqrt)
3. CalculatorWithMathCopy - калькулятор с библиотекой Math 
4. CalculatorWithMathExtends - наследование класса CalculatorWithOperator

ADDITIONAL
5. CalculatorWithCounterClassic - калькулятор с ручным счётчиком операций, наследующий класс CalculatorWithMathExtends
6. CalculatorWithCounterAutoSuper - калькулятор с автоматическим счётчиком операций, наследующий класс CalculatorWithMathExtends
7.2. CalculatorWithCounterAutoComposite - калькулятор с использованием композиции; включает счётчик операций
7.3. CalculatorWithCounterAutoAggregation - калькулятор с использованием агрегации с передачей в конструкторы трёх видов калькуляторов; включает счётчик операций
9. CalculatorWithCounterAutoAggregationInterface - класс, реализующий интерфейс ICalculator и делегирующий выполнение математических метдов стороннему калькулятору (CalculatorWithMathCopy); включает счётчик операций
10*. CalculatorWithMemory - калькулятор с функцией памяти
11.* CalculatorWithCounterAutoDecorator - декоратор со счётчиком операций
    CalculatorWithMemoryDecorator - декоратор с функцией памяти

API
8. ICalculator - интерфейс, включающий все используемые математические методы. Имплементирован классами из пакета SIMPLE

