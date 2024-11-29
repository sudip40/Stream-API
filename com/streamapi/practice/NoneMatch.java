package com.streamapi.practice;

import java.util.Arrays;
import java.util.List;

public class NoneMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);
        boolean bool = numbers.stream().noneMatch(number->number%2==0);
        System.out.println(bool);

        boolean bool2 = numbers.stream().noneMatch(number->number%2!=0);
        System.out.println(bool2);
    }
}
