package com.streamapi.practice.secondpart;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByOne {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        Map<Boolean, List<Integer>> evenOddPartitioning = numbers.stream()
                .collect(Collectors
                        .partitioningBy(num->num%2==0));

        System.out.println(evenOddPartitioning);
        System.out.println(evenOddPartitioning.get(true));
        System.out.println(evenOddPartitioning.get(false));
    }
}
