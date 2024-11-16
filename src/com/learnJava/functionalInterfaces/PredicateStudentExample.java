package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1=(student)-> student.getGradeLevel()>=3;
    static Predicate<Student> p2=(student)-> student.getGpa()>=3.9;

    public static void filterStudentByGradeLevel(){
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach((student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void filterStudents(){
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach((student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentsUsingNegate(){
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach((student -> {
            if(p1.negate().test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void main(String[] args) {

        System.out.println("filter by gradelevel");
        filterStudentByGradeLevel();
        System.out.println("filter by grade level and Gpa");
        filterStudents();
        System.out.println("filter by grade level and Gpausing negate");
        filterStudentsUsingNegate();

    }
}
