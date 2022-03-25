package home_work_1;

public class Task6 {
    public static String createPhoneNumber(int[] num) { // (123) 456-7890
        int a = num[0];
        int b = num[1];
        int c = num[2];
        int d = num[3];
        int e = num[4];
        int f = num[5];
        int g = num[6];
        int h = num[7];
        int i = num[8];
        int k = num[9];
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", a, b, c, d, e, f, g, h, i, k);
    }

    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(list));
    }
}
