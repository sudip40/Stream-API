package com.streamapi.practice.secondpart;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
    private String name;
    private Integer marks;

    public Student(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public Integer getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class GroupingByOne {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("A", 50),
                new Student("V", 80),
                new Student("K", 70),
                new Student("A", 50),
                new Student("V", 80),
                new Student("K", 70)
        );

        Map<Integer, List<Student>> studentByMarks = students.stream().collect(Collectors.groupingBy(Student::getMarks));
        System.out.println(studentByMarks);
    }
}
