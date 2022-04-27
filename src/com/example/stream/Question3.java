package com.example.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Q3 How to find duplicate elements in a given integers list in java using Stream functions?
 */
public class Question3 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> uniqueNumbers = new HashSet<>();
        myList.stream()
                .filter(n->!uniqueNumbers.add(n))
                .forEach(System.out::println);
    }
}
