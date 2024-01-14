package com.lambda.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Task 2: Uppercase Strings
 * Create a Consumer that converts a given string to uppercase and prints it.
 * Apply this consumer to process a list of strings and display the uppercase versions.
 */
public class DemoTwo {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(
                "Apple", "Banana", "Cherry", "Date", "Elderberry",
                "Fig", "Grape", "Honeydew", "Kiwi", "Lemon"
        );
        List<String> newList = new ArrayList<>();
        List<String> lowercaseList = new ArrayList<>();
        Consumer<List<String>> fruitList = list -> {
            for (int i = 0; i < list.size(); i++) {
                String s = list.get(i).toUpperCase();
                newList.add(s);
            }
        };
        // method one
        // --  fruitList.accept(stringList);
        // uppercase
        // -- System.out.println(newList);
        Consumer<List<String>> fruits = list -> list.stream().map(s -> s.toLowerCase()).forEach(lowercaseList::add);
        fruitList.andThen(fruits).accept(stringList);

        // method two
        // uppercase
        System.out.println(newList);
        // lower case
        System.out.println(lowercaseList);
    }
}
