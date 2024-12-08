package com.streamapi.practice.secondpart;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("My", "name", "is", "Sudip");

        String sentence = words.stream().collect(Collectors.joining(","));
        System.out.println(sentence);


        String fullSentence = words.stream().collect(Collectors.joining(" "));
        System.out.println(fullSentence);
    }
}
