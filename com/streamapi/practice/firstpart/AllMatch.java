package com.streamapi.practice.firstpart;

import java.util.Arrays;
import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);
        boolean bool = numbers.stream().allMatch(number->number%2==0);
        System.out.println(bool);

        boolean bool2 = numbers.stream().allMatch(number->number%2!=0);
        System.out.println(bool2);
    }
}
