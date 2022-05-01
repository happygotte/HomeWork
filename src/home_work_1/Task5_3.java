package home_work_1;

import java.util.Scanner;

public class Task5_3 implements ICommunicationPrinter{

    @Override
    public String welcome(String name) {
        switch (name) {
            case "Вася":
                return "Привет. \nЯ тебя так долго ждал.";
            case "Анастасия":
                return "Я тебя так долго ждал.";
            default:
                return "Добрый день, а вы кто?";
        }
    }
}
