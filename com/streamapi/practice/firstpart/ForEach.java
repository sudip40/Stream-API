package com.streamapi.practice.firstpart;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args){
        List<String> fruits = Arrays.asList("Mango", "Banana", "Orange");
        fruits.stream().forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        numbers.stream().forEach(a->System.out.println(a));

        numbers.stream().forEach(a->System.out.println(a*3));
    }
}
