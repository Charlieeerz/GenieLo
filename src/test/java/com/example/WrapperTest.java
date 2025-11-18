package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WrapperTest {

    @Test
    void testWrapperIncrementDecrement() {
        WrapperDemo.IntWrapper w = new WrapperDemo.IntWrapper(10);

        assertEquals(10, w.getValue());

        w.increment();
        assertEquals(11, w.getValue());

        w.decrement();
        assertEquals(10, w.getValue());
    }
}
