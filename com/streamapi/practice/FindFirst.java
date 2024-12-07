package com.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        Optional<Integer> num = numbers.stream().filter(a->a%2!=0).findFirst();
        num.ifPresent(System.out::println);
    }
}
