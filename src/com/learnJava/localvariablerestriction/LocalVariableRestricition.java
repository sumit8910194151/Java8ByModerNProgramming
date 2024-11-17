package com.learnJava.localvariablerestriction;

import java.util.function.Consumer;

public class LocalVariableRestricition {

    /*
    what is a local variable?
       *Any variable that is declaered insisde a method is called local variable

     restrcition on local variable s for lambda expression
       *Not allowed to use the same local variable name as lambda parameters or inside the lambda body
       *Not allowed reassigned a value to a local variable

     no restricition on Instance variable

     */

    public static void main(String[] args) {
        int i=0;
        Consumer<Integer> c1=(i1)->{//when we are using i heregetting error like already defined so we should not use it
            // not allowed int i=2;
            System.out.println(i1);
        };
    }
}
