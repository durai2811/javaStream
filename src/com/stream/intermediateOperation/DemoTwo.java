package com.stream.intermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoTwo {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        words.parallelStream().forEach(System.out::println);
        words.stream().peek(System.out::println).collect(Collectors.toList()); // peek is logger ,it does not make operation

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3);
        numbers.stream().dropWhile(n->n<3).forEach(System.out::println);

        // mapToInt
        List<String> numbersAsStrings = Arrays.asList("1", "2", "3", "4", "5");
        numbersAsStrings.stream().mapToInt(Integer::parseInt);

    }
}
