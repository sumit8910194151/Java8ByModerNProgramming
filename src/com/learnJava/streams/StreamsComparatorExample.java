package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sorrtStudentByName(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

    }

    public static List<Student> sorrtStudentByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());

    }

    public static List<Student> sorrtStudentByGpaReverse(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());

    }
    public static void main(String[] args) {
        System.out.println("Students sorted by name"+ sorrtStudentByName());
        System.out.println("Students sorted by Gpa"+ sorrtStudentByGpa());
        System.out.println("Students sorted by Gpa reversed"+ sorrtStudentByGpaReverse());

    }
}
