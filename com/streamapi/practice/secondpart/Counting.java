package com.streamapi.practice.secondpart;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Counting {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("My", "name", "is", "Sudip");
        Long count = words.stream().collect(Collectors.counting());
        System.out.println(count);
    }
}
