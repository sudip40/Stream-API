package com.streamapi.practice.secondpart;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByTwo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Mango", "Banana", "Orange", "Apple");
        Map<Boolean, List<String>> evenOddLength = fruits.stream()
                .collect(Collectors
                        .partitioningBy(fruit->fruit.length()%2==0));

        System.out.println(evenOddLength);
        System.out.println(evenOddLength.get(true));
        System.out.println(evenOddLength.get(false));
    }
}
