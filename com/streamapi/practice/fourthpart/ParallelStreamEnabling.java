package com.streamapi.practice.fourthpart;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamEnabling {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,1,8,9,2,4,7,1,7,4);

        System.out.println("Parallel Output 1");
        numbers.stream().parallel().forEach(System.out::println);

        System.out.println("Parallel Output 2");
        numbers.parallelStream().forEach(System.out::println);
    }
}
