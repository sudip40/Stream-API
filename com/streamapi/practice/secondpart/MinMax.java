package com.streamapi.practice.secondpart;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);
        //min
        Optional<Integer> minNum = numbers.stream().collect(Collectors.minBy(Comparator.naturalOrder()));
        minNum.ifPresent(System.out :: println);

        //max
        Optional<Integer> maxNum = numbers.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
        maxNum.ifPresent(System.out :: println);

        //reverse max
        Optional<Integer> reverseMax = numbers.stream().collect(Collectors.maxBy(Comparator.reverseOrder()));
        reverseMax.ifPresent(System.out::println);

        //reverse min
        Optional<Integer> reverseMin = numbers.stream().collect(Collectors.minBy(Comparator.reverseOrder()));
        reverseMin.ifPresent(System.out :: println);
    }
}
