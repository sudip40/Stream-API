package com.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> sqrNumbers = numbers.stream().map(num-> num*num)
                                                   .collect(Collectors.toList());
        System.out.println(sqrNumbers);


        List<String> fruits = Arrays.asList("Mango", "Banana", "Orange", "Apple");
        List<Integer> lengths = fruits.stream()
                                      .map(String::length)
                                      .collect(Collectors.toList());

        System.out.println(lengths);
    }
}
