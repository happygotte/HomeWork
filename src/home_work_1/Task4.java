package home_work_1;

import java.util.Scanner;

public class Task4 {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return weekday && vacation;
    }

    public static void main(String[] args) {  // без защиты от дурака
        Scanner in = new Scanner(System.in);
        System.out.println("Сегодня рабочий день? Введите да или нет");
        String weekday_ans = in.nextLine();
        System.out.println("Вы в отпуске? Введите да или нет");
        String vacation_ans = in.nextLine();
        boolean x = false;
        boolean y = false;

        if (weekday_ans.equals("да")) {
            x = true;
        }

        if (vacation_ans.equals("нет")) {
            y = true;
        }

        if (Task4.sleepIn(x, y)) {
            System.out.println("Пора на работу");
        } else {
            System.out.println("Можем дальше спать");
        }
    }
}
