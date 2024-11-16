package com.learnJava;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {
        /*
        * Prior to java 8
        * */

        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); //0-->o1==o2
                                         //1-->o1>o2
                                         //-1-->o1<o2
            }
        };
        System.out.println("Result of comparator is "+ comparator.compare(3,7));

        /*
        * using java 8
        * */

        Comparator<Integer> comparatorJava8= (a,b) -> a.compareTo(b);

        System.out.println("Result of comparator using JAVA8 is "+ comparatorJava8.compare(3,7));
    }
}
