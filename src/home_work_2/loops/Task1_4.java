package home_work_2.loops;

public class Task1_4 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        long a = 1;

        long after_over = num * a;
        long before_over = num;
        while (after_over * num /  before_over == num) {
            after_over *= num;
            before_over = after_over;
            }
        if (num > 0) {
            after_over *= num;
        } else {
            for (int i = 0; i < 2; i++) { // на знаю, почему для отриц. числа не хватает ещё одного умножения
                after_over *= num;
            }
        }

        System.out.println(before_over);
        System.out.println(after_over);
    }
}


