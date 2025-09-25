package com.learnJava.AllTestFolder;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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

        System.out.println("Start number with 1: "+list1.stream().filter(e->String.valueOf(e).startsWith("1")).collect(Collectors.toSet()));

        System.out.println("max number in array: "+list1.stream().reduce(Integer :: max));
        System.out.println("min number in array: "+list1.stream().reduce(Integer :: min));
        System.out.println("get second largest number: "+ list1.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst());
        System.out.println("get largest two number: "+ list1.stream().sorted(Comparator.reverseOrder()).limit(2).collect(Collectors.toSet()));
        System.out.println("get duplicates: "+list1.stream().filter(e-> Collections.frequency(list1,e)>1).collect(Collectors.toSet()));
        System.out.println("get non duplicates: "+list1.stream().filter(e-> Collections.frequency(list1,e)==1).collect(Collectors.toSet()));
        List<Integer> list2=Arrays.asList(11,21,34,21,31,32);
        List<Integer> list3=Arrays.asList(11,21,22,32,43,33);
        System.out.println("common element in both the lists: "+ list3.stream().filter(e->list2.contains(e)).collect(Collectors.toSet()));
        String str="Ie am the best";
        List<String> strList=Arrays.asList(str.split(""));
        System.out.println(strList);
        System.out.println("find first repeated character: "+ strList.stream().filter(e->Collections.frequency(strList,e)>1).findFirst());
        System.out.println("non repeated chars: "+ strList.stream().filter(e->Collections.frequency(strList,e)==1).collect(Collectors.toSet()));
        System.out.println("Capitalize e: "+ strList.stream().map(e->e.equals("e")?e.toUpperCase():e).collect(Collectors.joining()));
        System.out.println("Reverse string: "+strList.stream().reduce((a,b)->b+a));
        System.out.println("Reverse word by word: "+Arrays.asList(str.split(" ")).stream().reduce((a,b)->b+" " +a));

    }
}
