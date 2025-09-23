package com.learnJava.AllTestFolder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8PracticeQuestions {

    public static boolean isPrime(int num){
        return IntStream.rangeClosed(2, (int) Math.sqrt(num)).noneMatch(e->num%e==0);
    }

    public static void main(String[] args) {

        System.out.println("7 is a prime: "+isPrime(7));
        System.out.println("get sum of n natural numbers without optional:: "+IntStream.rangeClosed(0,10).sum());//with optional
        System.out.println("get sum of n natural numbers with optional: " + IntStream.rangeClosed(0, 10)
                .reduce(Integer::sum));

        System.out.println("Factorial of n: "+ IntStream.rangeClosed(1,3).reduce(1,(a,b)->a*b));
        System.out.println("Fibonacci series: ");
        Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(10).map(e -> e[0])
                .forEach(System.out::print);
        System.out.println("");
        List<Integer> list1= Arrays.asList(1,2,4,5,6,12,12,23,4,5,34,44,22,1,3,4);
        System.out.println("sum of array: "+ list1.stream().reduce(Integer::sum).get());
        System.out.println("average of array: "+list1.stream().mapToDouble(e->e).average().getAsDouble());
        System.out.println("Even of array: "+list1.stream().filter(e->e%2==0).collect(Collectors.toSet()));


        System.out.println("odd of array: "+list1.stream().filter(e->e%2!=0).collect(Collectors.toSet()) );
    }
}
