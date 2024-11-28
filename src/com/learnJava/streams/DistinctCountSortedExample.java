package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class DistinctCountSortedExample {
    /*converts one form to another just like map
    * used in context of stream where each element in the stream represents multiple elements
    * example: Stream<List<String>>, Stream<Arrays>
    * */

    public static List<String> printAllDistinctActivities() {
       List<String> studentActivities= StudentDataBase.getAllStudents().stream()//Stream<Student>
               .map(Student::getActivities)//Stream<List<String>>
               .flatMap(List::stream)//Stream<String>
               .distinct()
               .collect(toList());
       return studentActivities;
    }

    public static List<String> printAllDistinctActivitiesSorted() {
        List<String> studentActivities= StudentDataBase.getAllStudents().stream()//Stream<Student>
                .map(Student::getActivities)//Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .distinct()
                .sorted()
                .collect(toList());
        return studentActivities;
    }

    public static Long countAllDistinctActivities() {
        Long studentDistinctActivities= StudentDataBase.getAllStudents().stream()//Stream<Student>
                .map(Student::getActivities)//Stream<List<String>>
                .flatMap(List::stream)//Stream<String>
                .distinct()
                .count();
        return studentDistinctActivities;
    }



    public static void main(String[] args) {
        System.out.println(printAllDistinctActivities());
        System.out.println(countAllDistinctActivities());
        System.out.println("Sorted "+printAllDistinctActivitiesSorted());


    }

}
