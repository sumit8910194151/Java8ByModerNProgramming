package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

    /*
    * terminal operation used to reduce a steeam into asingle result
    * it takes 2 parameters as an input
    *    first parameter is initial value
    *    second parameter is BinaryOperator<T
    * */

    public static int performMultiplicaton(List<Integer> numbers){
        return numbers.stream()
                //1
                //3
                //5
                //7
                //a=1,b=1(from stream) result is 1
                //a=1(from previous result), b=3(from stream) result is 3
                //a=3(from previous result), b=5(from stream) result is 15
                //a=15(from previous result), b=7(from stream) result is 105
                .reduce(1,(a,b)->a*b);
    }

    public static Optional<Integer> performMultiplicatonWithoutIdentity(List<Integer> numbers){
        return numbers.stream()
                //1
                //3
                //5
                //7
                //a=1,b=1(from stream) result is 1
                //a=1(from previous result), b=3(from stream) result is 3
                //a=3(from previous result), b=5(from stream) result is 15
                //a=15(from previous result), b=7(from stream) result is 105
                .reduce((a,b)->a*b);
    }

    public static Optional<Student> getHighestGpqStudent(){
        return StudentDataBase.getAllStudents().stream().reduce((Student s1, Student s2)->s1.getGpa()>s2.getGpa()?s1:s2);
    }
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,3,5,7);
        System.out.println(performMultiplicaton(numbers));
        System.out.println("Without identity");
        System.out.println(performMultiplicatonWithoutIdentity( numbers).isPresent());
        if(getHighestGpqStudent().isPresent()) {
            System.out.println(getHighestGpqStudent().get());
        }

    }
}
