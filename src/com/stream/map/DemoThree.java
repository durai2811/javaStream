package com.stream.map;

import java.util.ArrayList;
import java.util.List;

/**
 * Task 3: Extracting Length of Strings
 * Use the map operation to obtain the length of each string in a list of strings.*/
public class DemoThree {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("apple");
        fruitsList.add("banana");
        fruitsList.add("orange");
        fruitsList.add("grape");

        fruitsList.stream().map(n -> n.length()).forEach(System.out::println);
    }
}
