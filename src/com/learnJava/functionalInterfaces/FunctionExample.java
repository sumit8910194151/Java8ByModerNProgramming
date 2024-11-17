package com.learnJava.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    /*
    * have a single abstract method T apply(V) which takes single input snd returns single output
    * */

    static Function<String, String> functionExample = (name) -> name.toUpperCase();

    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println("Result is: "+ functionExample.apply("java8"));
        System.out.println("Result of andThen is: "+ functionExample.andThen(addSomeString).apply("java8"));

    }



}
