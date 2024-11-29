package com.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);
        Optional<Integer> sum = numbers.stream().reduce((a, b)-> a + b);
        if(sum.isPresent()){
            System.out.println(sum.get());
        }
        Optional<Integer> multi = numbers.stream().reduce((a,b)->a*b);
        if(multi.isPresent()){
            System.out.println(multi.get());
        }

        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        if(max.isPresent()){
            System.out.println(max.get());
        }
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        if(min.isPresent()){
            System.out.println(min.get());
        }
    }
}
