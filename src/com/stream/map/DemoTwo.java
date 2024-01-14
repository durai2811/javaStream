package com.stream.map;

import java.util.ArrayList;
import java.util.List;

/**
 * Task 2: Converting Strings to Uppercase
 * Apply the map operation to convert each string in a list to uppercase.*/
public class DemoTwo {
    public static void main(String[] args) {

        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("apple");
        fruitsList.add("banana");
        fruitsList.add("orange");
        fruitsList.add("grape");

        fruitsList.stream().map(n ->n.toUpperCase()).forEach(System.out::println);

    }
}
