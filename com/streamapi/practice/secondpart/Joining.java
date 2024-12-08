package com.streamapi.practice.secondpart;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    public static void main(String[] args) {
        List<String> sentence = Arrays.asList("My", "name", "is", "Sudip");

        String fullSentence = sentence.stream().collect(Collectors.joining(","));
        System.out.println(fullSentence);


        String fullSentence1 = sentence.stream().collect(Collectors.joining(" "));
        System.out.println(fullSentence1);
    }
}
