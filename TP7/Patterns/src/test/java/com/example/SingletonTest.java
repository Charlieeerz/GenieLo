package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    void testSingletonInstance() {
        SingletonDemo.Singleton s1 = SingletonDemo.Singleton.getInstance();
        SingletonDemo.Singleton s2 = SingletonDemo.Singleton.getInstance();

        assertSame(s1, s2, "Singleton instances should be the same");
        assertEquals("Hello from Singleton!", s1.getMessage());
    }
}
