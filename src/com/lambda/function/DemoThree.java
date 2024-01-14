package com.lambda.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Task 3: Length of String Function
 * Develop a Function that calculates the length of a given string.
 * Use this function to obtain a list of integers representing the lengths of strings in a list.
 */
public class DemoThree {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(
                "Apple", "Banana", "Cherry", "Date", "Elderberry",
                "Fig", "Grape", "Honeydew", "Kiwi", "Lemon"
        );

        Function<String, Integer> findLength = (n) -> n.length();
        Function<String, String> toUppercase = (n) -> n.toUpperCase();
        Function<String, String> toLowercase = (n) -> n.toLowerCase();
        List<String> list = new ArrayList<>();

        for (String processString : stringList) {
            StringBuilder stringBuilder = new StringBuilder();
            Integer apply = toUppercase.andThen(toLowercase).andThen(findLength).apply(processString);// 1st changed uppercase 2nd change as lowercase and length of string
            String string = toUppercase.apply(processString);
            stringBuilder.append(apply).append(" - ").append(string);
            list.add(stringBuilder.toString());
        }
        System.out.println(list);
    }
}