package com.stream.map;

import java.util.Arrays;
import java.util.List;

/**
 * Task 1: Doubling Numbers
 * Use the map operation to double each element in a list of integers.*/
public class DemoOne {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numberList.stream().map(n ->(int) Math.pow(n,2)).forEach(System.out::println);
    }
}
