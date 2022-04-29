package com.example.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Q9 Given a list of integers, find out all the counts of numbers exist in the list using Stream functions?
 */
public class Question9 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,10,15,8,8,49,25,98,32);
        HashMap<Integer,Integer> hm = new HashMap<>();
        myList.forEach(n-> {
                    if (hm.containsKey(n)) {
                        hm.put(n,hm.get(n)+1);
                    } else {
                        hm.put(n,1);
                    }
                });
        hm.keySet().forEach(n->System.out.println(n+" ---> "+hm.get(n)));
    }
}
