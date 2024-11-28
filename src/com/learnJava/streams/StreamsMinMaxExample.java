package com.learnJava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> numbers){

        return numbers.stream()
                .reduce(0,(a,b)->a>b?a:b);

    }

    public static Optional<Integer> findMaxValueByOptional(List<Integer> numbers){

        return numbers.stream()
                .reduce((a,b)->a>b?a:b);

    }

    public static Optional<Integer> findMinValueByOptional(List<Integer> numbers){

        return numbers.stream()
                .reduce((a,b)->a>b?a:b);

    }

    public static int findMinValue(List<Integer> numbers){

        return numbers.stream()
                .reduce(0,(a,b)->a>b?a:b);

    }


    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(6,7,8,9,10);
        int maxValue=findMaxValue(numbers); //In case of empty list this will return 0 which is not correct so better to use optional
        System.out.println("max value is "+maxValue);

        Optional<Integer> maxValueByOptional=findMaxValueByOptional(numbers);
        if(maxValueByOptional.isPresent()){
            System.out.println("max value by optional is " + maxValueByOptional.get());
        }else {

            System.out.println("max value by optional is empty");
        }



    }
}
