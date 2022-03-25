package home_work_1;

public class Task3 {
    public static void main(String[] args) {
        int a = 144;
        double x = Math.sqrt(a);
        System.out.println(x);

        double b = 25;
        double c = 2;
        double y = Math.pow(b, c);
        System.out.println(y);

        double z = Math.max(x, y);
        double w = Math.ceil(2.7) + Math.floor(3.5);
        double q = Math.negateExact((int) w);
        System.out.println(Math.multiplyExact((int) z, (int) q));

        System.out.println(Math.abs(Math.subtractExact(a, (int) y)));
    }
}
