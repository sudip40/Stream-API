package com.streamapi.practice.firstpart;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);

        List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueNumbers);

        List<String> items = Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item1", "Item2", "Item3", "Item4", "Item5");

        List<String> uniqueItems = items.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueItems);
    }
}
