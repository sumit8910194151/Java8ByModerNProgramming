package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1=(s)->s.getGradeLevel()>=3;
    Predicate<Student> p2=(s)->s.getGpa()>=3.9;

    BiPredicate<Integer, Double> biPredicate =(gradeLevel, gpa)-> gradeLevel>=3 && gpa>=3.9;

    BiConsumer<String, List<String>> studentListBiConsumer=(name, activities) -> System.out.println(name+" : "+activities);


    Consumer<Student> studentConsumer=(student) -> {
        if(p1.and(p2).test(student)){
            studentListBiConsumer.accept(student.getName(), student.getActivities());
        }

    };

    Consumer<Student> studentConsumerBiPredicate=(student) -> {
        if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
            studentListBiConsumer.accept(student.getName(), student.getActivities());
        }

    };

    public void printNameAndActivities(List<Student> allStudents){
        allStudents.forEach(studentConsumer);

    }

    public void printNameAndActivitiesUsingBiPredicate(List<Student> allStudents){
        allStudents.forEach(studentConsumerBiPredicate);

    }

    public static void main(String[] args) {

        List<Student> allStudents = StudentDataBase.getAllStudents();
        System.out.println("***********using Predicate*****************");
        new PredicateAndConsumerExample().printNameAndActivities(allStudents);
        System.out.println("***********using BiPredicate*****************");
        new PredicateAndConsumerExample().printNameAndActivitiesUsingBiPredicate(allStudents);

    }
}
