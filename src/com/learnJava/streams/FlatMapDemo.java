package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlatMapDemo {
    /*converts one form to another just like map
    * used in context of stream where each element in the stream represents multiple elements
    * example: Stream<List<String>>, Stream<Arrays>
    * */

    public static List<String> printAllActivities() {
       List<String> studentActivities= StudentDataBase.getAllStudents().stream()//Stream<Student>
               .map(Student::getActivities)//Stream<List<String>>
               .flatMap(List::stream)//Stream<String>
               .collect(toList());
       return studentActivities;
    }

    public static void main(String[] args) {

    }

}
