package com.lambda.predicate;

import java.util.function.Predicate;

/**
 * Task 1: Even Numbers Predicate
 * Write a Predicate to check if a given integer is an even number.
 * Use this Predicate to filter out even numbers from a list of integers.
 * */
public class DemoOne {
    public static void main(String[] args) {
        Predicate<Integer> pEvenFilter =integer -> integer % 2==0;
        boolean test = pEvenFilter.test(30);
        System.out.println(test);
    }
}
