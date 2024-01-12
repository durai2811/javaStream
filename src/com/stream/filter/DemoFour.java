package com.stream.filter;

import java.util.Arrays;
import java.util.List;

public class DemoFour {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Alice", 90),
                new Student("Bob", 85),
                new Student("Charlie", 95),
                new Student("David", 80)
        );

        studentList.stream().filter(student -> student.getGrade() >= 90).forEach(System.out::println);
    }
}

class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
