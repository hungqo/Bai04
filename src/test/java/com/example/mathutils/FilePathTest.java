package com.example.mathutils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Path;
import org.junit.jupiter.api.Test;

class FilePathTest {

    @Test
    void testPathCreatedByJavaNioWorksOnAllOperatingSystems() {
        Path path = Path.of("data", "input.txt");

        assertEquals("input.txt", path.getFileName().toString());
        assertTrue(path.toString().contains("data"));
    }
}