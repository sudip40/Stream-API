package com.streamapi.practice.secondpart;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Summing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        Integer sum = numbers.stream()
                        .collect(Collectors.summingInt(Integer :: intValue));
        System.out.println(sum);
    }
}
