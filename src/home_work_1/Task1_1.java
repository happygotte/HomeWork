package home_work_1;

public class Task1_1 {
    public static void main(String[] args) {
        int a = 42; // 00101010 ;
        int b = 15; // 00001111

        System.out.println(~a); // -43, дополнительный код 11010101
        System.out.println(~b); // -16, дополнительный код 11110000

        int c = a & b;
        int d = a | b;
        int e = a ^ b;
        int f = a << 1;
        int g = a << b;
        int h = a >> 3;
        int i = a >> b;
        int k = a >>> 4;

        System.out.println(c); // 10, 00001010
        System.out.println(d); // 47, 00101111
        System.out.println(e); // 37, 00100101
        System.out.println(f); // 84, 01010100
        System.out.println(g); // 1376256, 00000000000101010000000000000000
        System.out.println(h); // 5, 00000101
        System.out.println(i); // 0, биты сдвинуты за пределы правой границы
        System.out.println(k); // 2, 00000010

        a &= b;
        System.out.println(a); // 10, 00001010

        a = 42;
        a |= b;
        System.out.println(a); // 47, 00101111

        a = 42;
        a ^= b;
        System.out.println(a); // 37, 00100101

        a = 42;
        a <<= 1; //
        System.out.println(a); // 84, 01010100

        a = 42;
        a >>= 3;
        System.out.println(a); // 5, 00000101

        a = 42;
        a >>>= 4;
        System.out.println(a); // 2, 00000010
    }
}
