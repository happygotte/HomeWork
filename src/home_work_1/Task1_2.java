package home_work_1;

public class Task1_2 {
    public static void main(String[] args) {
        int a = -42; // 11010110 здесь и дальше дополнительные коды
        int b = -15; // 11110000

        System.out.println(~a); // 00101010
        System.out.println(~b); // 00001110

        int c = a & b;
        int d = a | b;
        int e = a ^ b;
        int f = a << b;
        int g = a << 2;
        int h = a >> b;
        int i = a >> 2;
        int k = a >>> 30;

        System.out.println(c); // -48, 11010000
        System.out.println(d); // -9, 11110111
        System.out.println(e); // 39, 00100111
        System.out.println(f); // -5505024, 11111111101010111111111111111111
        System.out.println(g); // -168, 101011000
        System.out.println(h); // -1, 11111110
        System.out.println(i); // -11, 11110101
        System.out.println(k); // 3, 00000011

        a &= b;
        System.out.println(a); // -48, 11010000

        a = -42;
        a |= b;
        System.out.println(a); // -9, 11110111

        a = -42;
        a ^= b;
        System.out.println(a); // 39, 00100111

        a = -42;
        a <<= 2; //
        System.out.println(a); // -168, 101011000

        a = -42;
        a >>= 2;
        System.out.println(a); // -11, 11110101

        a = -42;
        a >>>= 30;
        System.out.println(a); // 3, 00000011
    }
}