package com.example.mathutils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import org.junit.jupiter.api.Test;

class FilePathTest {

    @Test
    void testHardCodedWindowsSeparator() {
        String expectedSeparator = "\\";
        String actualSeparator = File.separator;

        assertEquals(
                expectedSeparator,
                actualSeparator,
                "This test only passes on Windows because it expects a Windows path separator.");
    }
}