package home_work_2.loops;

public class Task1_4_edit {

    /**
     * Перемножение заданного числа до переполнения
     * @param x целое число
     * @param y целое число
     */
    public static int multBeforeAndAfterOverflow(long x, long y) { // предполагается, что х != 0 и у != 0
        long result = x;
        long before = x;

        while(true) {
            result *= y;
            if(result % before != 0 || result == 0) {
                System.out.println(before);
                System.out.println(result);
                return 1; // для прохождения теста добавила этот return
            } else if(y == -1) {
                System.out.println("Бесконечное умножение");
                return -1; // для прохождения теста добавила этот return
            }
            before = result;
        }
    }
}


