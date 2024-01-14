package com.lambda.predicate;

import java.util.Arrays;
import java.util.List;

public class DemoTwo implements Predicate {
    public static void main(String[] args) {
        DemoTwo demoTwo = new DemoTwo();
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for (int i : integerList) {
            if (demoTwo.test(i))
                System.out.println(i);
        }

    }
    @Override
    public boolean test(int value) {
        return value % 2 == 0;
    }
}

interface Predicate {
    boolean test(int value);
}
