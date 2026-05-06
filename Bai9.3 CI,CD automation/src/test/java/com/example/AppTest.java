package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testFactorial() {
        assertEquals(120, App.factorial(5));
        assertEquals(1, App.factorial(0));
    }
}