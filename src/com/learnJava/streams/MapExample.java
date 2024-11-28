package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {
        List<String> studentName= StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.toList());
    }
}
