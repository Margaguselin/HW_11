package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Lesson3.makeBricks;
import static org.junit.jupiter.api.Assertions.*;

public class Lesson3Test {
    @Test
    void onlyWithBig() {
        boolean result = makeBricks(0, 3, 10);
        assertTrue(result);
    }

    @Test
    void onlyWithSmall() {
        boolean result = makeBricks(15, 0, 10);
        assertTrue(result);
    }

    @Test
    void canBuildWithSmallAndBig() {
        boolean result = makeBricks(3, 2, 7);
        assertTrue(result);
    }

    @Test
    void notEnoughtBriks() {
        boolean result = makeBricks(1, 2, 8);
        assertFalse(result);
    }
}