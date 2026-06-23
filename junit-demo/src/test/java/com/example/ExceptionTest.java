package com.example;

import org.junit.Test;
import static org.junit.Assert.assertThrows;

public class ExceptionTest {
    @Test
    public void testException() {
        // Using assertThrows to check for ArithmeticException
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0; // division by zero
        });
    }
}
