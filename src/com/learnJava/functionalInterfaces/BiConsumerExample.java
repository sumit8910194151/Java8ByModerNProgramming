package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    /*
    * Bi consumer will take two inputs and perform some operation
    * */

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer2=(name,activities) -> System.out.println(name + " : " + activities);

        List<Student> allStudents = StudentDataBase.getAllStudents();
        for (Student allStudent : allStudents) {
            biConsumer2.accept(allStudent.getName(),allStudent.getActivities());
        }
    }

    public static void main(String[] args) {

        BiConsumer<String,String> biConsumer= (a,b) -> {
            System.out.println("a: "+a+" b: "+b );
        };

        biConsumer.accept("Sumit","Singh");
        BiConsumer<Integer,Integer> biConsumerMultiply= (a,b) -> {
            System.out.println("multiply is "+a*b);
        };

        BiConsumer<Integer,Integer> biConsumerDivide= (a,b) -> {
            System.out.println("Divide is "+a/b);
        };

        biConsumerMultiply.andThen(biConsumerDivide).accept(10,5);

        nameAndActivities();

    }
}
