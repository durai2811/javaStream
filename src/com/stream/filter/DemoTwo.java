package com.stream.filter;

import java.util.Arrays;
import java.util.List;

/**
 * Task 2: Filtering Strings with Length greater than 3
 * Given a list of strings, filter out the strings with a length greater than 3.
 **/
public class DemoTwo {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "do", "elderberry");
        stringList.stream().filter(s -> s.length() > 3).forEach(System.out::println);

    }
}
