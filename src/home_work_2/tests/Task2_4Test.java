package home_work_2.tests;

import home_work_2.arrays.Task2_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Task2_4Test {

    int[] arr1 = new int[]{3, 15, 10, 25, 6, 11, 2, 24, 13, 19, 14, 1, 9, 4, 23, 5, 7, 22, 8, 17, 21, 18, 12, 16, 20};
    int[] arr2 = new int[]{13, -56, 33, 54, 61, -65, 32, 7, 50, 6, 40, 24, -24, 0, 31, 3, 10, -16, 87, 80, 9, -94, 0, 31, -86};
    int[] arr3 = new int[]{3};
    int[] arr4 = new int[]{-1, -2, -3};
    int[] arr5 = new int[]{-5};
    int[] arr6 = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
    int[] arr7 = new int[]{7, 7, 7, 7, 7, 7};


    @Test
    public void sumEven () {
        Assertions.assertEquals(156, Task2_4.sumEven(arr1));
        Assertions.assertEquals(296, Task2_4.sumEven(arr2));
        Assertions.assertEquals(0, Task2_4.sumEven(arr3));
        Assertions.assertEquals(0, Task2_4.sumEven(arr4));
        Assertions.assertEquals(0, Task2_4.sumEven(arr5));
        Assertions.assertEquals(0, Task2_4.sumEven(arr6));
        Assertions.assertEquals(0, Task2_4.sumEven(arr7));
    }

    @Test
    public void maxEven() {
        Assertions.assertEquals(23, Task2_4.maxEven(arr1));
        Assertions.assertEquals(87, Task2_4.maxEven(arr2));
        Assertions.assertEquals(3, Task2_4.maxEven(arr3));
        Assertions.assertEquals(-1, Task2_4.maxEven(arr4));
        Assertions.assertEquals(-5, Task2_4.maxEven(arr5));
        Assertions.assertEquals(0, Task2_4.maxEven(arr6));
        Assertions.assertEquals(7, Task2_4.maxEven(arr7));
    }

    @Test
    public void lesser() {
        Assertions.assertEquals("3; 10; 6; 11; 2; 1; 9; 4; 5; 7; 8; 12; ", Task2_4.lesser(arr1));
        Assertions.assertEquals("-56; -65; 7; 6; -24; 0; 3; -16; -94; 0; -86; ", Task2_4.lesser(arr2));
        Assertions.assertEquals("", Task2_4.lesser(arr3));
        Assertions.assertEquals("-3; ", Task2_4.lesser(arr4));
        Assertions.assertEquals("", Task2_4.lesser(arr5));
        Assertions.assertEquals("", Task2_4.lesser(arr6));
        Assertions.assertEquals("", Task2_4.lesser(arr7));
    }

    @Test
    public void twoLesser() {
        Assertions.assertEquals("[1, 2]", Arrays.toString(Task2_4.twoLesser(arr1)));
        Assertions.assertEquals("[-94, -86]", Arrays.toString(Task2_4.twoLesser(arr2)));
        Assertions.assertEquals("[3]", Arrays.toString(Task2_4.twoLesser(arr3)));
        Assertions.assertEquals("[-3, -2]", Arrays.toString(Task2_4.twoLesser(arr4)));
        Assertions.assertEquals("[-5]", Arrays.toString(Task2_4.twoLesser(arr5)));
        Assertions.assertEquals("[0, 0]", Arrays.toString(Task2_4.twoLesser(arr6)));
        Assertions.assertEquals("[7, 7]", Arrays.toString(Task2_4.twoLesser(arr7)));
    }

    @Test
    public void compressAndFillZeros() {
        Assertions.assertEquals(
                "[3, 25, 6, 2, 24, 1, 9, 4, 23, 5, 7, 22, 8, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]",
                Arrays.toString(Task2_4.compressAndFillZeros(arr1, 10, 20)));
        Assertions.assertEquals(
                "[-56, -65, -24, -16, -94, -86, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]",
                Arrays.toString(Task2_4.compressAndFillZeros(arr2, 0, 100)));
        Assertions.assertEquals("[0]", Arrays.toString(Task2_4.compressAndFillZeros(arr3, 3, 3)));
        Assertions.assertEquals("[-1, -2, -3]",
                Arrays.toString(Task2_4.compressAndFillZeros(arr4, 0,10)));
    }

    @Test
    public void sumDigits() {
        Assertions.assertEquals(127, Task2_4.sumDigits(arr1));
        Assertions.assertEquals(165, Task2_4.sumDigits(arr2));
        Assertions.assertEquals(3, Task2_4.sumDigits(arr3));
        Assertions.assertEquals(6, Task2_4.sumDigits(arr4));
        Assertions.assertEquals(5, Task2_4.sumDigits(arr5));
        Assertions.assertEquals(0, Task2_4.sumDigits(arr6));
        Assertions.assertEquals(42, Task2_4.sumDigits(arr7));
    }
}
