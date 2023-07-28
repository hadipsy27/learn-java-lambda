package com.labs.app;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {

        // Menggunakan anonymous class
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        };
        consumer.accept("Hadi Prasetyo");

        System.out.println("-----------------------------------");

        // Menggunakan Lambda Expression
        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("Andi Suryanto");

    }
}
