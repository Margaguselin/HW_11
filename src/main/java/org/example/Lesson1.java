package org.example;
import java.util.*;


public class Lesson1 {
    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(1, 2, 3);
        Integer result1 = maxDuplicate(nums1);
        System.out.println("maxDuplicate([1, 2, 3]) => " + result1); // Вернет null

        List<Integer> nums2 = Arrays.asList(1, 2, 2);
        Integer result2 = maxDuplicate(nums2);
        System.out.println("maxDuplicate([1, 2, 2]) => " + result2); // Вернет 2

        List<Integer> nums3 = Arrays.asList(1, 2, 2, 1, 1);
        Integer result3 = maxDuplicate(nums3);
        System.out.println("maxDuplicate([1, 2, 2, 1, 1]) => " + result3); // Вернет 2
    }

    /**
     * Возвращает наибольший элемент, у которого есть хотя бы один дубликат.
     *
     * Если ни один элемент не имеет дубликатов (элемента с тем же значением), возвращает null.
     *
     * @param nums Список целых чисел
     * @return Максимальный элемент с дубликатом. Null, если дубликат не найден.
     */
    public static Integer maxDuplicate(List<Integer> nums) {
        if (nums == null || nums.isEmpty()) {
            return null;
        }

        Set<Integer> seen = new HashSet<>();
        Integer maxDuplicate = null;

        for (Integer num : nums) {
            if (!seen.add(num)) {
                // Если элемент уже был добавлен в множество (имеет дубликат),
                // обновляем максимальное значение с дубликатом, если необходимо.
                if (maxDuplicate == null || num > maxDuplicate) {
                    maxDuplicate = num;
                }
            }
        }

        return maxDuplicate;
    }



}
