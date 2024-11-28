package com.learnJava.streams;


import java.util.ArrayList;

public class CollectionsVsStreams {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Jane");
        names.add("Jack");
        //List can be modified

        //streams can not be modified


        // names.stream().add() no add or remove operation


        //Elements in collection can be accessed in any order. Use appropriate methods based on the collection
        //Elements in stream can be accessed only in sequential order



        //collection is eagerly constructed
        //stream is lazily constructed


        //Collection can be traversed n number of times
        //stream can not be traversed ony once


        //collection performs external operation to iterate through the elements
        //stream performs internal operation to iterate through the elements

    }


}
