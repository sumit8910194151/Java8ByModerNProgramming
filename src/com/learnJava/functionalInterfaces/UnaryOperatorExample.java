package com.learnJava.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    /*
    * takes input and output of the same type and extends function interface
    *
    * */

    static UnaryOperator<String> unaryOperator=(s)->s.concat("Default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java8"));

    }



}
