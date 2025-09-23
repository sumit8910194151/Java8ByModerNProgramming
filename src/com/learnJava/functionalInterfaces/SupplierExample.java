package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    /*
    * functional interface with single abstract method supply which doesn't take any input
    * but returns an output
    * */

    public static void main(String[] args) {
        Supplier<Student> supplierExample=()->{
return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"), 10);
        };

        Supplier<List<Student>> allStudents=()->{
            return StudentDataBase.getAllStudents();
        };

        System.out.println("student is: "+supplierExample.get());

        System.out.println("All students: "+allStudents.get());
    }
}
