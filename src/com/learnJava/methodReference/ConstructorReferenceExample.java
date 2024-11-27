package com.learnJava.methodReference;

import com.learnJava.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
    static Supplier<Student> studentSupplier = Student::new; //this is valid

    static Function<String, Student> studentFunction= Student::new; //complains if there is single argument constructor in Student


    public static void main(String[] args) {
        System.out.println(studentSupplier.get());

        //Student student = Student::new;// Invalid

    }
}
