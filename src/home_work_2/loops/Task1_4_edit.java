package home_work_2.loops;

public class Task1_4_edit {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        long a = 1;
        multBeforeAndAfterOverflow(a, num);
    }

    /**
     * Перемножение заданного числа до переполнения
     * @param x целое число
     * @param y целое число
     */
    public static void multBeforeAndAfterOverflow(long x, long y) { // предполагается, что х != 0 и у != 0
        long result = x;
        long before = x;

        while(true) {
            result *= y;
            if(result % before != 0 || result == 0) {
                System.out.println(before);
                System.out.println(result);
                break;
            } else if(y == -1) {
                System.out.println("Бесконечное умножение");
                break;
            }
            before = result;
        }
    }
}


