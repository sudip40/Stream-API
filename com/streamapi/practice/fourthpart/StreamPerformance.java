package com.streamapi.practice.fourthpart;

import java.util.ArrayList;
import java.util.List;

public class StreamPerformance {
    public static void main(String[] args) {
        // For 10000 numbers
        List<Integer> numbers1 = new ArrayList<>();
        for(int i=0; i<=10000; i++){
            numbers1.add(i);
        }
        long seqStartTime = System.nanoTime();
        numbers1.stream().mapToLong(StreamPerformance :: factorial).sum();
        long seqEndTime = System.nanoTime();
        long seqTimeDiff = seqEndTime - seqStartTime;
        System.out.println("Sequential processing time for 10000 : "+seqTimeDiff);

        long parStartTime = System.nanoTime();
        numbers1.stream().mapToLong(StreamPerformance :: factorial).sum();
        long parEndTime = System.nanoTime();
        long parTimeDiff = parEndTime - parStartTime;
        System.out.println("Parallel processing time for 10000 : "+parTimeDiff);


        // For 100000 numbers
        List<Integer> numbers2 = new ArrayList<>();
        for(int i=0; i<=100000; i++){
            numbers2.add(i);
        }
        long seqStartTime1 = System.nanoTime();
        numbers2.stream().mapToLong(StreamPerformance :: factorial).sum();
        long seqEndTime1 = System.nanoTime();
        long seqTimeDiff1 = seqEndTime1 - seqStartTime1;
        System.out.println("Sequential processing time for 100000 : "+seqTimeDiff1);

        long parStartTime1 = System.nanoTime();
        numbers2.stream().mapToLong(StreamPerformance :: factorial).sum();
        long parEndTime1 = System.nanoTime();
        long parTimeDiff1 = parEndTime1 - parStartTime1;
        System.out.println("Parallel processing time for 100000 : "+parTimeDiff1);


        // For 100000 numbers
        List<Integer> numbers3 = new ArrayList<>();
        for(int i=0; i<=1000000; i++){
            numbers3.add(i);
        }
        long seqStartTime2 = System.nanoTime();
        numbers3.stream().mapToLong(StreamPerformance :: factorial).sum();
        long seqEndTime2 = System.nanoTime();
        long seqTimeDiff2 = seqEndTime2 - seqStartTime2;
        System.out.println("Sequential processing time for 1000000 : "+seqTimeDiff2);

        long parStartTime2 = System.nanoTime();
        numbers3.stream().mapToLong(StreamPerformance :: factorial).sum();
        long parEndTime2 = System.nanoTime();
        long parTimeDiff2 = parEndTime2 - parStartTime2;
        System.out.println("Parallel processing time for 1000000 : "+parTimeDiff2);
    }

    public static long factorial(int n){
        long fact = 1;
        for(int i = 1; i<=n; i++){
            fact=fact*i;
        }
        return fact;
    }
}
