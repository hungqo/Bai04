package com.example.mathutils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        int sum = MathUtils.add(10, 5);
        int difference = MathUtils.subtract(10, 5);
        int product = MathUtils.multiply(10, 5);
        int quotient = MathUtils.divide(10, 5);

        logger.info("Sum result: {}", sum);
        logger.info("Difference result: {}", difference);
        logger.info("Product result: {}", product);
        logger.info("Quotient result: {}", quotient);
    }
}