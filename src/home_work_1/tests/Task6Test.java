package home_work_1.tests;

import home_work_1.Task6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6Test {

    @Test
    public void createPhoneNumber() {

        int[] list = {1,2,3,4,5,6,7,8,9,0};
        Assertions.assertEquals("(123) 456-7890", Task6.createPhoneNumber(list));
    }

}
