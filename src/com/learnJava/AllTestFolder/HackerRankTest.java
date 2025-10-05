package com.learnJava.AllTestFolder;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HackerRankTest {

    public static void main(String[] args) {

        List<Integer> list1= Arrays.asList(1,4,4,4,5,3);
        int i=migratoryBirds(list1);
        System.out.println(i);

    }

    public static int migratoryBirds(List<Integer> arr) {

        Map<Integer, List<Integer>> map1=arr.stream().collect(Collectors.groupingBy(Function.identity()));
        Collection<List<Integer>> list1=map1.values();
        int max= list1.stream().mapToInt(List::size).filter(list -> list >= 0).max().orElse(0);
        Optional<Integer> i=map1.entrySet().stream().filter(e->e.getValue().size()==max).map(e->e.getKey()).toList().stream().sorted().findFirst();
        return i.get();

    }
}
