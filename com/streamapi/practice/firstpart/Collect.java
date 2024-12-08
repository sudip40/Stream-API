package com.streamapi.practice.firstpart;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args){
        List<String> fruits = Arrays.asList("Orange", "Mango", "Banana", "Orange");

        List<String> newFruits = fruits.stream().collect(Collectors.toList());
        System.out.println(newFruits);


        Set<String> uniqueFruits = fruits.stream().collect(Collectors.toSet());
        System.out.println(uniqueFruits);

        String fruit = fruits.stream().collect(Collectors.joining(","));
        System.out.println(fruit);
    }
}
