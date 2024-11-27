package com.learnJava.localvariablerestriction;

import java.util.function.Consumer;

public class LocalVariableRestrictions2 {
     static int value2=4;

    public static void main(String[] args) {
        int value=4;
        Consumer<Integer> c1=(i)->{
          //  value++; --> not allowed as it is local variable
            value2++; // allowed as it is an instance variable
            System.out.println(value);
        };
    }
}
