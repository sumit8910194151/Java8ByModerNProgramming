package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        //Student name and their activities in a map
        Map<String, List<String>> studentMap =StudentDataBase.getAllStudents().stream()
                .filter(s->s.getGradeLevel()>=3)
                .filter(s->s.getGpa()>=3.9)
                 .collect(Collectors.toMap(Student::getName, Student::getActivities));




        /*how stream api works
        .stream creates sequence of students
        .filter() an intermediate operation used to filter out the student
        .collect() terminal operation and it is used to collect the result no operation will be performed without collect
         so collect stsrts the stream opersation so stream api is lazy

        * */


    }
}
