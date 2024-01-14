package com.lambda.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Task 5: Student Grade Classification Function
 * Implement a Function that classifies a student's grade based on a numerical score.
 * Use this function to transform a list of students by assigning a grade classification to each based on their scores.
 */
public class DemoFive {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("001", "Alice", 90),
                new Student("002", "Bob", 85),
                new Student("003", "Charlie", 95),
                new Student("004", "David", 80)
        );
        Predicate<Student> gradeA = score -> score.getGrade() > 90 && score.getGrade() <= 100;
        Predicate<Student> gradeB = score -> score.getGrade() > 80 && score.getGrade() <= 90;
        Predicate<Student> gradeC = score -> score.getGrade() > 70 && score.getGrade() <= 80;
        Predicate<Student> gradeD = score -> score.getGrade() > 60 && score.getGrade() <= 70;

        Function<Student, String> grade = gradeWise -> {
            if (gradeA.test(gradeWise))
                return "A";
            else if (gradeB.test(gradeWise))
                return "B";
            else if (gradeC.test(gradeWise))
                return "C";
            else if (gradeD.test(gradeWise))
                return "D";
            else return "F";
        };
        List<Student> students = new ArrayList<>();
        for (Student student : studentList) {
            String rank = grade.apply(student);
            student.setRank(rank);
            students.add(student);
        }
        System.out.println(students);

    }
}

class Student {
    private final String studentId;
    private final String studentName;
    private int grade;
    private String rank;

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", grade=" + grade +
                ", rank='" + rank + '\'' +
                '}';
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Student(String studentId, String studentName, int grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;

    }
}