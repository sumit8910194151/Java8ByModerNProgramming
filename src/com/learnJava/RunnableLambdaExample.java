package com.learnJava;

import java.sql.SQLOutput;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /*
        * Prioir to java 8
        * */

        Runnable runnable =new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnablr");
            }
        };
        new Thread(runnable).start();

        //Java 8 implementation
        Runnable runnable2 =()->{
            System.out.println("inside runnable 2");
        };
        new Thread(runnable2).start();

        /*
        * more simple waye
        * */

        Runnable runnable3 =()-> System.out.println("inside runnable 3");
        new Thread(runnable3).start();

        new Thread(()-> System.out.println("inside runnable 4")).start();

    }
}
