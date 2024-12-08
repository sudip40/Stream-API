package com.streamapi.practice.firstpart;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        Optional<Integer> num = numbers.stream().filter(a->a%2==0).findAny();
        num.ifPresent(System.out::println);
    }
}
