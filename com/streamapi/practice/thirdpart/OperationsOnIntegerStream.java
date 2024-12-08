package com.streamapi.practice.thirdpart;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OperationsOnIntegerStream {
    public static void main(String[] args) {
        int[] numbers = {3,1,8,9,2,4,7,1,7,4};
        int sum = IntStream.of(numbers).sum();
        System.out.println(sum);

        OptionalInt max = IntStream.of(numbers).max();
        System.out.println(max.getAsInt());


        OptionalInt min = IntStream.of(numbers).min();
        System.out.println(min.getAsInt());


        OptionalDouble avg = IntStream.of(numbers).average();
        System.out.println(avg.getAsDouble());
    }
}
