package com.upskill.asignment_4;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCounter {
    public static int countDuplicates(int[] array) {
        // Create a HashMap to store the count of each element in the array
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count the occurrences of each element in the array
        for (int element : array) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }

        int duplicateCount = 0;

        // Calculate the count of duplicates
        for (int count : countMap.values()) {
            if (count > 1) {
                duplicateCount += count - 1;
            }
        }

        return duplicateCount;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5};
        int duplicates = countDuplicates(array);
        System.out.println("Number of duplicates: " + duplicates);
    }
}