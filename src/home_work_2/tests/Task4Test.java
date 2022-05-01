package home_work_2.tests;

import home_work_2.Utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Task4Test {

    int[] arr1 = {1,2,3,4,5,6};
    int[] arr2 = {1,1,1,1};
    int[] arr3 = {9,1,5,99,9,9};
    int[] arr4 = {};
    int[] arr5 = {6,5,4,3,2,1};
    int[] arr6 = {13, -56, 33, 54, 61, -65, 32, 7, 50, 6, 40, 24, -24, 0, 31, 3, 10, -16};
    int[] arr7 = {13};


    @Test
    public void bubbleSort() {
        SortsUtils.bubble(arr1);
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(arr1));
        SortsUtils.bubble(arr2);
        Assertions.assertEquals("[1, 1, 1, 1]", Arrays.toString(arr2));
        SortsUtils.bubble(arr3);
        Assertions.assertEquals("[1, 5, 9, 9, 9, 99]", Arrays.toString(arr3));
        SortsUtils.bubble(arr4);
        Assertions.assertEquals("[]", Arrays.toString(arr4));
        SortsUtils.bubble(arr5);
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(arr5));
        SortsUtils.bubble(arr6);
        Assertions.assertEquals("[-65, -56, -24, -16, 0, 3, 6, 7, 10, 13, 24, 31, 32, 33, 40, 50, 54, 61]", Arrays.toString(arr6));
        SortsUtils.bubble(arr7);
        Assertions.assertEquals("[13]", Arrays.toString(arr7));
    }

    @Test
    public void shakeSort() {
        SortsUtils.shake(arr1);
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(arr1));
        SortsUtils.shake(arr2);
        Assertions.assertEquals("[1, 1, 1, 1]", Arrays.toString(arr2));
        SortsUtils.shake(arr3);
        Assertions.assertEquals("[1, 5, 9, 9, 9, 99]", Arrays.toString(arr3));
        SortsUtils.shake(arr4);
        Assertions.assertEquals("[]", Arrays.toString(arr4));
        SortsUtils.shake(arr5);
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(arr5));
        SortsUtils.shake(arr6);
        Assertions.assertEquals("[-65, -56, -24, -16, 0, 3, 6, 7, 10, 13, 24, 31, 32, 33, 40, 50, 54, 61]", Arrays.toString(arr6));
        SortsUtils.shake(arr7);
        Assertions.assertEquals("[13]", Arrays.toString(arr7));
    }

}
