package com.lambda.supplier;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class DemoOne {
    public static void main(String[] args) {

        Supplier<Integer> random =() -> new Random().nextInt();
        System.out.println(random.get());

        Supplier<String> uuid = () -> UUID.randomUUID().toString();
        System.out.println(uuid.get());

        Supplier<String> date =() -> LocalDate.now().toString();
        System.out.println(date.get());
    }
}
