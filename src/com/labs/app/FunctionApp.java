package com.labs.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {

        // Menggunakan Anonymous class
        Function<String, Integer> functionLength = new Function<String, Integer>() {
            @Override
            public Integer apply(String value) {
                return value.length();
            }
        };
        System.out.println(functionLength.apply(""));
        System.out.println("--------------------------------");

        // Menggunakan Lambda
        Function<String, Integer> functionLength1 = value -> value.length();
        System.out.println(functionLength1.apply("Hadi"));


        System.out.println("--------------------------------");
        Function<String, Integer> functionLength2 = String::length;

        System.out.println(functionLength2.apply("Andi"));
    }
}
