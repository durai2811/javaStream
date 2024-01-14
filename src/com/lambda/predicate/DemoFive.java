package com.lambda.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Task 4: Age Predicate for Students
 * Define a Predicate to check if a student's age is less than 21.
 * Use this Predicate to filter out students who are younger than 21 from a list of student objects.
 */
public class DemoFive {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student("Alice", 20),
                new Student("Bob", 19),
                new Student("Charlie", 21),
                new Student("David", 22),
                new Student("Eva", 18),
                new Student("Frank", 20),
                new Student("Grace", 19),
                new Student("Hank", 22),
                new Student("Ivy", 18),
                new Student("Jack", 21)
        );

        Predicate<Student> checkAge = p -> p.getAge() < 21;
        for (Student student : studentList) {
            if (checkAge.test(student))
                System.out.println(student);
        }
    }
}

class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}