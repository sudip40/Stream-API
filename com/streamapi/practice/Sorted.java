package com.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);

        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedNumbers);
    }
}
