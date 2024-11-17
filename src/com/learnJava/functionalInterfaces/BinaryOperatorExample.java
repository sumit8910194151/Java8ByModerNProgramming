package com.learnJava.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    /*
    * it takes 2 input and returns output of the same type it extends bifunction
    * functional interface
    *
    * */

    static Comparator<Integer> comparator=(a, b)->a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a,b)->a*b;
        System.out.println("Result of multiplication is: "+binaryOperator.apply(3,4));

        BinaryOperator<Integer> maxBy=BinaryOperator.maxBy(comparator);
        System.out.println("Result of max by is: "+maxBy.apply(3,4));

        BinaryOperator<Integer> minBy=BinaryOperator.minBy(comparator);
        System.out.println("Result of min by is: "+minBy.apply(3,4));



    }
}