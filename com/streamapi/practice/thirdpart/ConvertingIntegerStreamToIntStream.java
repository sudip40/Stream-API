package com.streamapi.practice.thirdpart;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ConvertingIntegerStreamToIntStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,1,8,9,2,4,7,1,7,4);
        IntStream intStream = numbers.stream().mapToInt(Integer :: intValue);

        System.out.println(intStream.sum());
    }

}
