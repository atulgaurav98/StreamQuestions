package com.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Q6 Given a list of integers, find the maximum value element present in it using Stream functions?
 */
public class Question6 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max = myList.stream()
                .max(Comparator.naturalOrder()).get();
        System.out.println(max);
    }
}
