package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorAAATest {
    private int value;

    @Before
    public void setUp() {
        // Arrange: initialize test data
        value = 10;
    }

    @After
    public void tearDown() {
        // Cleanup after each test
        value = 0;
    }

    @Test
    public void testAddition() {
        // Act
        int result = value + 5;

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testMultiplication() {
        // Act
        int result = value * 2;

        // Assert
        assertEquals(20, result);
    }
}
