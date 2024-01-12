package com.stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Task 1: Filtering Positive Numbers
 * Given a list of integers, filter out the positive numbers.
 */
public class DemoOne {
    public static void main(String[] args) {
        List<Integer> mixedIntegerList = Arrays.asList(-5, 10, -3, 8, -1, 7, -2, 6, -4, 9);
        List<Integer> integerList = mixedIntegerList.stream().filter(positive -> positive > 0).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
