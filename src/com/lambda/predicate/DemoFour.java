package com.lambda.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Task 3: Prime Numbers Predicate
 * Implement a Predicate to determine if a given integer is a prime number.
 * Utilize this Predicate to filter out prime numbers from a list of integers.
 */
public class DemoFour {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        Predicate<Integer> p2 = n ->n > 1 && isDivisible(n);
        for (int i : integerList) {
            if (p2.test(i))
                System.out.println(i);
        }
    }

    private static boolean isDivisible(Integer n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
