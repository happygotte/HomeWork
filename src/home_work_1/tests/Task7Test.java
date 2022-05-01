package home_work_1.tests;

import home_work_1.Task7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task7Test {

    @Test
    public void toBinaryString() {

        byte a = 42;
        byte b = 15;
        byte c = -42;
        byte d = -15;
        byte o = 0;


        Assertions.assertEquals("00101010", Task7.toBinaryString(a));
        Assertions.assertEquals("00001111", Task7.toBinaryString(b));
        Assertions.assertEquals("11010110", Task7.toBinaryString(c));
        Assertions.assertEquals("11110001", Task7.toBinaryString(d));
        Assertions.assertEquals("00000000", Task7.toBinaryString(o));

    }
}
