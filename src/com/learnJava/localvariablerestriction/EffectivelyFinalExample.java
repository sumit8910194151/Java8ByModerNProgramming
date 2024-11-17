package com.learnJava.localvariablerestriction;

import java.util.function.Consumer;

public class EffectivelyFinalExample {
    /*
    *lambdas are allowed to use locla variables but not allowed to modify it even though they are not declared final
    * This concept is called effectively final
    * Not allowed to modify the value inside the lambda

     */
    public static void main(String[] args) {

        int value=4;
        Consumer<Integer> c1=(a)-> {
            //value=6 re assigning not allowed
            //System.out.println(i+value)
        };
    }
}
