package home_work_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        byte number;

        System.out.println("Введите число от -128 до 127.");
        number = console.nextByte();

        System.out.println(toBinaryString(number));

    }

    public static String toBinaryString(byte number) {
        byte[] binaryNumber = new byte[]{0, 0, 0, 0, 0, 0, 0, 0};

        if (number == 0) {
            return "00000000";

        } else if (number > 0) {
            toBinary(binaryNumber, number);
            return toAppString(binaryNumber);


        } else {
            number = (byte) (128 - Math.abs(number)); // так и не поняла до конца, почему отнимаем от 128, а не от 256

            toBinary(binaryNumber, number);
            binaryNumber[0] = 1;
            return toAppString(binaryNumber);
        }
    }

    public static byte[] toBinary(byte[] arr, byte number) {
        for (int i = 7; number > 0; i--) {
            byte temp = (byte) (number % 2);
            arr[i] = temp;
            number /= 2;
        }
        return arr;
    }

    public static String toAppString(byte[] arr) {
        StringBuilder binaryString = new StringBuilder();
        for (byte b : arr) {
            binaryString.append(b);
        }
        return ""+binaryString;
    }
}
