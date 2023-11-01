package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.Lesson2.wordNumeration;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Lesson2Test {
    @Test
    void testAllDifferentWords(){
        List<String> words = List.of("Yo", "By", "Neo");
        List<String> output = wordNumeration(words);
        assertEquals(3, output.size());
        assertEquals("Yo#1", output.get(0));
        assertEquals("By#1", output.get(1));
        assertEquals("Neo#1", output.get(2));
    }
    @Test
    void testDuplicateWordLowerCase(){
        List<String> words = List.of("yo", "by", "neo", "yo");
        List<String> output = wordNumeration(words);
        assertEquals(4, output.size());
        assertEquals("yo#1", output.get(0));
        assertEquals("by#1", output.get(1));
        assertEquals("neo#1", output.get(2));
        assertEquals("yo#2", output.get(3));
    }
    @Test
    void testDuplicateWordMixCase(){
        List<String> words = List.of("yo", "by", "neo", "yo","Yo","Neo");
        List<String> output = wordNumeration(words);
        assertEquals(6, output.size());
        assertEquals("yo#1", output.get(0));
        assertEquals("by#1", output.get(1));
        assertEquals("neo#1", output.get(2));
        assertEquals("yo#2", output.get(3));
        assertEquals("Yo#3", output.get(4));
        assertEquals("Neo#2", output.get(5));
    }
}
