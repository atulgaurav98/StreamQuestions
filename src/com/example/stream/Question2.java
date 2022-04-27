package com.example.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
 */
public class Question2 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream()
                .map(String::valueOf)
                .filter(n->n.startsWith("1"))
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }
}
