package com.lambda.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Task 1: Square Function
 * Implement a Function that takes an integer as input and returns its square.
 * Use this function to transform a list of integers by squaring each element.*/
public class DemoOne {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Function<type of parameter input,return type of parameter output>
        Function<Integer, Integer> intValue = integer -> (int) Math.pow(integer, 2);
        for (int value : integerList) {
            int square = intValue.apply(value);
            System.out.println(square);
        }

    }
}
