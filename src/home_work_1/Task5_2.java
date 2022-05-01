package home_work_1;

import java.util.Objects;

public class Task5_2 implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        boolean isFriend = Objects.equals(name, "Вася");
        boolean isGirl = Objects.equals(name, "Анастасия");

        if (isFriend) {
            return "Привет. \nЯ тебя так долго ждал.";
        } else if (isGirl) {
            return "Я тебя так долго ждал.";
        } else {
            return "Добрый день, а вы кто?";
        }
    }
}
