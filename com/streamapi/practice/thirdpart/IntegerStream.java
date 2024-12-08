package com.streamapi.practice.thirdpart;

import java.util.stream.IntStream;

public class IntegerStream {
    public static void main(String[] args) {
        IntStream.range(1,10).forEach(System.out::println);

        System.out.println("----------------------------------------------------------");

        IntStream.rangeClosed(1,10).forEach(System.out::println);

        System.out.println("----------------------------------------------------------");

        long count1 = IntStream.rangeClosed(1,10).count();
        System.out.println(count1);
        System.out.println("----------------------------------------------------------");

        long count2 = IntStream.range(1,10).count();
        System.out.println(count2);
    }
}
