package home_work_2.tests;

import home_work_2.loops.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {

    @Test
    public void factorial() {
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 = 120", Task1_1_1.factorial("5"));
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 = 40320", Task1_1_1.factorial("8"));
        Assertions.assertEquals("Введены недопустимые данные", Task1_1_1.factorial("-8"));
        Assertions.assertEquals("Введены недопустимые данные", Task1_1_1.factorial("qwerty"));
        Assertions.assertEquals("Введено слишком большое число", Task1_1_1.factorial("123"));
    }

    @Test
    public void factorialRecursion() {
        Assertions.assertEquals(120, Task1_1_2.factorial(5), "1 * 2 * 3 * 4 * 5 = "); // Надо ли вводить сообщения?
        Assertions.assertEquals(40320, Task1_1_2.factorial(8), "8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = ");
        Assertions.assertEquals(0, Task1_1_2.factorial(-8), "Введено отрицательное число");
        Assertions.assertEquals(0, Task1_1_2.factorial(123), "Введено слишком большое число");
    }

    @Test
    public void multiply() {
        Task1_2 task1_2 = new Task1_2();

        Assertions.assertEquals("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080", task1_2.multiply("181232375"));
        Assertions.assertEquals("Введено не целое число", task1_2.multiply("99.2"));
        Assertions.assertEquals("Введено не целое число", task1_2.multiply("99,2"));
        Assertions.assertEquals("Введено не число", task1_2.multiply("Привет"));
        Assertions.assertEquals("Введено не число", task1_2.multiply("2.345.5"));
        Assertions.assertEquals("Произошло переполнение", task1_2.multiply("9999999999999999999999999999999999"));
    }

    @Test
    public void power() {
        Task1_3 task1_3 = new Task1_3();

        Assertions.assertEquals("18.0 ^ 5 = 1889568.0", task1_3.power(18,5));
        Assertions.assertEquals("7.5 ^ 2 = 56.25", task1_3.power(7.5,2));
        Assertions.assertEquals("Степень числа должна быть положительной", task1_3.power(7.5,-2));
    }

    @Test
    public void multBeforeAndAfterOverflow() {
        Assertions.assertEquals(-1, Task1_4_edit.multBeforeAndAfterOverflow(1,-1));
        Assertions.assertEquals(1, Task1_4_edit.multBeforeAndAfterOverflow(1,3));
        Assertions.assertEquals(1, Task1_4_edit.multBeforeAndAfterOverflow(1,188));
        Assertions.assertEquals(1, Task1_4_edit.multBeforeAndAfterOverflow(1,-19));
        Assertions.assertEquals(1, Task1_4_edit.multBeforeAndAfterOverflow(1,500));




    }

}
