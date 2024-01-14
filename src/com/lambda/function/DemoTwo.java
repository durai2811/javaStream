package com.lambda.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Task 2: Uppercase Function for Strings
 * Create a Function that converts a given string to uppercase.
 * Apply this function to transform a list of strings by converting each string to uppercase.
 */
public class DemoTwo {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(
                "Apple", "Banana", "Cherry", "Date", "Elderberry",
                "Fig", "Grape", "Honeydew", "Kiwi", "Lemon"
        );
        List<String> addList = new ArrayList<>();
        Function<String, String> uppercaseChange = n -> n.toUpperCase();
        for (String toUp : stringList) {
            String apply = uppercaseChange.apply(toUp);
            addList.add(apply);
        }
        System.out.println(addList);
    }
}
