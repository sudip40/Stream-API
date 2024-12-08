package com.streamapi.practice.firstpart;

import java.util.Arrays;
import java.util.List;

public class ToArray {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Mango", "Banana", "Orange", "Apple");
        String[] fruitsArr = fruits.stream().toArray(String[] :: new);
        for(String fruit : fruitsArr){
            System.out.println(fruit);
        }

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] numberArr = numbers.stream().toArray(Integer[] :: new);
        for(Integer number : numberArr){
         System.out.println(number);
        }
    }
}
