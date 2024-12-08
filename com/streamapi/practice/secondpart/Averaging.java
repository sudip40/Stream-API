package com.streamapi.practice.secondpart;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Averaging {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        Double avg = numbers.stream().collect(Collectors.averagingInt(Integer :: intValue));
        System.out.println(avg);
    }
}
