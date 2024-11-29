package com.streamapi.practice;

import java.util.Arrays;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Mango", "Banana", "Orange", "Apple");
        Long cont = fruits.stream().count();
        System.out.println(cont);
    }
}
