package home_work_2.loops;

public class Task1_4 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        long after_over = num;
        long before_over = num;
        while (after_over > 0) {
            after_over *= num;
            if (after_over > 0) {
                before_over = after_over;
            }
        }
        System.out.println(before_over);
        System.out.println(after_over);
    }
}