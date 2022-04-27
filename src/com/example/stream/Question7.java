package com.example.stream;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Q7 Given a String, find the first non-repeated character in it using Stream functions?
 */
public class Question7 {
    public static void main(String[] args) {
        String input = "Java Hungry Blog Alive is Awesome";
        Set<Character> uniqueChars = new HashSet<>();
        Character character = input.chars()
                // First convert to Character object and then to lowercase
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                //Store the chars in map with count
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(character);
    }
}
