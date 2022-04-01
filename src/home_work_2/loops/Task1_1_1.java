package home_work_2.loops;

public class Task1_1_1 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int result = 1;
        String s = "";
        for (int i = 1; i <= num; i++) {
            result = result * i;
            if (result <= 0) {  // проверка на переполнение с прерыванием цикла
                System.out.println("Произошло переполнение");
                break;
            } else {
                if (i < num) {  // если число не последнее, добавить *
                    s += i + " * ";
                } else {
                    s += i;
                }
            }
        }
        if (result > 0) {  // в случае без переполнения вывести результат
            System.out.println(s + " = " + result);
        }
    }
}


