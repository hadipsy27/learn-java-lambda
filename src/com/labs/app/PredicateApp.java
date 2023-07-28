package com.labs.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {

        // Menggunakan anonymous class
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.isBlank();
            }
        };

        System.out.println(predicate.test("Hadi"));


        System.out.println("--------------------------------");

        // Menggunakan Lambda Expression
        Predicate<String> predicate1 = value -> value.isBlank();

        System.out.println(predicate1.test(""));
    }
}
