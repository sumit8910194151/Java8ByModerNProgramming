package com.learnJava.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p1=(i)->i%2==0;
    static Predicate<Integer> p2=(i)->i%5==0;

    static void predicateAnd(){
        System.out.println("preciate and result is " + p1.and(p2).test(10));
        System.out.println("preciate and result is " + p1.and(p2).test(9));
    }

    static void predicateOr(){
        System.out.println("preciate and result is " + p1.or(p2).test(10));
        System.out.println("preciate and result is " + p1.or(p2).test(9));
    }

    static void predicateNegate(){
        System.out.println("preciate and result is " + p1.or(p2).negate().test(10));
        System.out.println("preciate and result is " + p1.or(p2).negate().test(9));
    }

    public static void main(String[] args) {

        predicateOr();
        predicateAnd();
        predicateNegate();


    }
}
