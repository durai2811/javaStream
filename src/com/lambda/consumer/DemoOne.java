package com.lambda.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Task 1: Displaying Square of Numbers
 * Implement a Consumer that takes an integer as input and prints its square.
 * Apply this consumer to process a list of integers and display the squares.
 */
public class DemoOne {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // method one
        Consumer<Integer> modify = number -> System.out.println((int) Math.pow(number, 2));
        modify.accept(2);
        // method two
        List<Integer> list = new ArrayList<>();
        Consumer<List<Integer>> modifyList = number -> {
            for (int i = 0; i < number.size(); i++) {
                System.out.print((int) Math.pow(number.get(i), 2)+ " ");
            }
        };
        modifyList.accept(numberList);
    }
}
