package com.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Q9 Given a list of integers, sort all the values present in it using Stream functions(both ascending and descending)?
 */
public class Question8 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        //ascending
        myList.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("---------------------------------");
        //descending
        myList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
