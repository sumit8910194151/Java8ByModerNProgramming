package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMapRedusceExample {

    public static int totalNoOfNoteBooks(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNoteBooks)
                .reduce(0,Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(totalNoOfNoteBooks());

    }
}
