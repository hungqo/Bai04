package com.example.mathutils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {

    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public static int add(int a, int b) {
        logger.info("Adding two numbers: a={}, b={}", a, b);
        return a + b;
    }

    public static int subtract(int a, int b) {
        logger.info("Subtracting two numbers: a={}, b={}", a, b);
        return a - b;
    }

    public static int multiply(int a, int b) {
        logger.info("Multiplying two numbers: a={}, b={}", a, b);
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            logger.error("Division failed because divisor is zero. a={}, b={}", a, b);
            throw new IllegalArgumentException("Divisor must not be zero.");
        }

        logger.info("Dividing two numbers: a={}, b={}", a, b);
        return a / b;
    }
}