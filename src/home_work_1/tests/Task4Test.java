package home_work_1.tests;

import home_work_1.Task4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4Test {

    @Test
    public void isSleep() {
        Assertions.assertTrue(Task4.sleepIn(true, true));
        Assertions.assertFalse(Task4.sleepIn(false, false));
        Assertions.assertFalse(Task4.sleepIn(true, false));
        Assertions.assertFalse(Task4.sleepIn(false, true));


    }


}
