package com.example.mathutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilsTest {

    @Test
    void testAdd() {
        assertEquals(15, MathUtils.add(10, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5, MathUtils.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(50, MathUtils.multiply(10, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, MathUtils.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> MathUtils.divide(10, 0)
        );
    }
}