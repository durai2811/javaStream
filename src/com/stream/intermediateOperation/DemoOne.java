package com.stream.intermediateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoOne {
    public static void main(String[] args) {
        // find  how many even numbers
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        long count = number.stream().filter(n -> n % 2 == 0).count();
        System.out.println(count);
        // count length
        List<String> words = Arrays.asList("apple", "banana", "orange");
        words.stream().map(String::length).forEach(System.out::println);
        // flat map
        List<String> words1 = Arrays.asList("apple", "banana", "orange");
        List<String> words2 = Arrays.asList("app", "ban", "org");
        Arrays.asList(words1, words2).stream().flatMap(l -> l.stream()).forEach(System.out::println);

        // Distinct
        List<String> dis = Arrays.asList("apple", "orange", "banana", "apple");
        dis.stream().distinct().forEach(System.out::println);
        // sort
        dis.stream().distinct().sorted().forEach(System.out::println);
        // reduce
        Optional<Integer> optionalInteger = number.stream().reduce(Integer::sum);
        Integer integer = optionalInteger.get();
        System.out.println(integer);
        // collect
        String collect = dis.stream().collect(Collectors.joining(","));
        System.out.println(collect);
        // min
        Integer integer1 = number.stream().min(Integer::min).get();
        System.out.println(integer1);
        // max
        Integer integer2 = number.stream().max(Integer::max).get();
        System.out.println(integer2);
        // ANYMATCH (if any one match is true) ,all match ( all should match is ture) , non match (should not match all data is return true) are return boolean
        number.stream().anyMatch(n -> n % 2 == 0); // boolean
        // find first ,findany
        Optional<String> first = dis.stream().findFirst();
        System.out.println(first.get());
        Optional<String> b = dis.stream().filter(n -> n.startsWith("b")).findFirst();
        System.out.println(b.get());
        Optional<String> any = dis.stream().findAny();
        System.out.println(any.get());




    }
}
