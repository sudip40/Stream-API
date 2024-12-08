package com.streamapi.practice.thirdpart;

import java.util.stream.IntStream;

public class MapTo {
    public static void main(String[] args) {
        int[] numbers = {3,1,8,9,2,4,7,1,7,4};
        IntStream.of(numbers)
                .mapToObj(num-> "This is an integer : "+ num)
                .forEach(System.out::println);

        IntStream.of(numbers)
                .mapToDouble(num-> Math.sqrt(num))
                .forEach(System.out::println);

        IntStream.of(numbers)
                .mapToLong(num->num*num)
                .forEach(System.out::println);
    }
}
