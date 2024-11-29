package com.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);
        List<Integer> evenNumbers = numbers.stream().filter(number->number%2==0).collect(Collectors.toList());
        List<Integer> oddNumbers = numbers.stream().filter(number->number%2!=0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);

        List<String> fruits = Arrays.asList("Mango", "Banana", "Orange", "Apple");
        List<String> newFruits = fruits.stream().filter(fruit->fruit.length()%2==0).collect(Collectors.toList());
        System.out.println(newFruits);
        List<String> newFruits2 = fruits.stream().filter(fruit->fruit.length()%2!=0).collect(Collectors.toList());
        System.out.println(newFruits2);
    }
}
