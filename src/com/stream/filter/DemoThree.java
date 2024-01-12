package com.stream.filter;
/**
 * Task 3: Filtering Even Numbers
 * Given a list of integers, filter out the even numbers.
 */

import java.util.Arrays;
import java.util.List;

public class DemoThree {
    public static void main(String[] args) {
        List<Integer> mixedIntegerList = Arrays.asList(-5, 10, -3, 8, -1, 7, -2, 6, -4, 9);

        mixedIntegerList.stream().filter(even -> even > 0 && even % 2 == 0).forEach(System.out::println);

    }
}
