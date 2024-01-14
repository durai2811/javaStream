package com.lambda.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
* Task 2: String Length Predicate
* Create a Predicate to check if a given string has a length greater than 5.
* Apply this Predicate to filter out strings with lengths greater than 5 from a list of strings.
 */
public class DemoThree {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList(
                "Apple", "Banana", "Cherry", "Date", "Elderberry",
                "Fig", "Grape", "Honeydew", "Kiwi", "Lemon"
        );

        Predicate<String> findLength = string -> string.length() > 5;

        for (String string:stringList) {
            if (findLength.test(string))
                System.out.println(string);
        }

    }
}
