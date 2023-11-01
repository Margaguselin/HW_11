package org.example;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class Lesson1Test {
    @Test
    void testMaxDuplicateWithNullList() {
        List<Integer> nums = null;
        Integer result = Lesson1.maxDuplicate(nums);
        assertNull(result);
    }

    @Test
    void testMaxDuplicateWithEmptyList() {
        List<Integer> nums = Arrays.asList();
        Integer result = Lesson1.maxDuplicate(nums);
        assertNull(result);
    }

    @Test
    void testMaxDuplicateWithNoDuplicates() {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        Integer result = Lesson1.maxDuplicate(nums);
        assertNull(result);
    }

    @Test
    void testMaxDuplicateWithDuplicates() {
        List<Integer> nums = Arrays.asList(1, 2, 2, 1, 1);
        Integer result = Lesson1.maxDuplicate(nums);
        assertEquals(2, result);
    }
}

