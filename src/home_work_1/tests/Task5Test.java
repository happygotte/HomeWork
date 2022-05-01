package home_work_1.tests;

import home_work_1.Task5_1;
import home_work_1.Task5_2;
import home_work_1.Task5_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task5Test {

    @Test
    public void welcomeName() {
        Task5_1 task5_1 = new Task5_1();

        Assertions.assertEquals("Привет. \nЯ тебя так долго ждал.", task5_1.welcome("Вася"));
        Assertions.assertEquals("Я тебя так долго ждал.", task5_1.welcome("Анастасия"));
        Assertions.assertEquals("Добрый день, а вы кто?", task5_1.welcome("Ибрагим"));


        Task5_2 task5_2 = new Task5_2();

        Assertions.assertEquals("Привет. \nЯ тебя так долго ждал.", task5_2.welcome("Вася"));
        Assertions.assertEquals("Я тебя так долго ждал.", task5_2.welcome("Анастасия"));
        Assertions.assertEquals("Добрый день, а вы кто?", task5_2.welcome("Ибрагим"));

        Task5_3 task5_3 = new Task5_3();

        Assertions.assertEquals("Привет. \nЯ тебя так долго ждал.", task5_3.welcome("Вася"));
        Assertions.assertEquals("Я тебя так долго ждал.", task5_3.welcome("Анастасия"));
        Assertions.assertEquals("Добрый день, а вы кто?", task5_3.welcome("Ибрагим"));
    }




}
