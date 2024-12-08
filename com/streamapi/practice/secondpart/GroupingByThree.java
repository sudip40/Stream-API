package com.streamapi.practice.secondpart;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByThree {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("A", 50),
                new Student("V", 80),
                new Student("K", 70),
                new Student("A", 50),
                new Student("V", 80),
                new Student("K", 70)
        );

        Map<Integer, List<String>> studentNameByMarks = students.stream()
                .collect(Collectors
                        .groupingBy(Student :: getMarks , Collectors
                                .mapping(Student::getName, Collectors.toList())));

        System.out.println(studentNameByMarks);
    }
}
