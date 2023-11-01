package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(wordNumeration(List.of("hi", "hi", "welcome")));
        System.out.println(wordNumeration(List.of("Hi", "hi", "Welcome", "no", "hI", "HI")));
    }

    public static List<String> wordNumeration(List<String> words) {
        List<String> wordNumerationList = new ArrayList<String>();
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            int count = wordCounts.getOrDefault(word.toLowerCase(), 0) + 1;
            wordCounts.put(word.toLowerCase(), count);
            wordNumerationList.add(word + "#" + count);


        }
        return wordNumerationList;
    }

}
