package home_work_2.tests;

import home_work_2.arrays.DoWhileOperation;
import home_work_2.arrays.ForEachOperation;
import home_work_2.arrays.ForOperation;
import home_work_2.arrays.WhileOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2_3Test {

    int[] arr = new int[]{1, 2, 3, 4, 5};
    String allElemString = "1 элемент = 1; 2 элемент = 2; 3 элемент = 3; 4 элемент = 4; 5 элемент = 5; ";
    String allElemStringRev = "5 элемент = 5; 4 элемент = 4; 3 элемент = 3; 2 элемент = 2; 1 элемент = 1; ";

    @Test
    public void doWhileOperation () {
        DoWhileOperation d_w1 = new DoWhileOperation();

        Assertions.assertEquals(allElemString, d_w1.allElem(arr));
        Assertions.assertEquals("2 элемент = 2; 4 элемент = 4; ", d_w1.oddElem(arr));
        Assertions.assertEquals("Недостаточно элементов в массиве", d_w1.oddElem(new int[]{1}));
        Assertions.assertEquals(allElemStringRev, d_w1.reverse(arr));
    }

    @Test
    public void whileOperation () {
        WhileOperation w1 = new WhileOperation();

        Assertions.assertEquals(allElemString, w1.allElem(arr));
        Assertions.assertEquals("2 элемент = 2; 4 элемент = 4; ", w1.oddElem(arr));
        Assertions.assertEquals("Недостаточно элементов в массиве", w1.oddElem(new int[]{1}));
        Assertions.assertEquals(allElemStringRev, w1.reverse(arr));
    }

    @Test
    public void ForOperation () {
        ForOperation fori = new ForOperation();

        Assertions.assertEquals(allElemString, fori.allElem(arr));
        Assertions.assertEquals("2 элемент = 2; 4 элемент = 4; ", fori.oddElem(arr));
        Assertions.assertEquals("Недостаточно элементов в массиве", fori.oddElem(new int[]{1}));
        Assertions.assertEquals(allElemStringRev, fori.reverse(arr));
    }

    @Test
    public void ForEachOperation () {
        ForEachOperation foreach = new ForEachOperation();

        Assertions.assertEquals(allElemString, foreach.allElem(arr));
        Assertions.assertEquals("2 элемент = 2; 4 элемент = 4; ", foreach.oddElem(arr));
        Assertions.assertEquals("Недостаточно элементов в массиве", foreach.oddElem(new int[]{1}));
        Assertions.assertEquals(allElemStringRev, foreach.reverse(arr));
    }
}
