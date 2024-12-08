package com.streamapi.practice.fourthpart;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamPipeline {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,1,8,9,2,4,7,1,7,4);
        numbers.stream()
                .parallel()
                .filter(num->num%2==0)
                .forEach(num->System.out.println(num*2));
    }
}
