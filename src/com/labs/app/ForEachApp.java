package com.labs.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {

        List<String> list = List.of("Hadi", "Dika", "Andi");

        // for loop
        for (var value : list){
            System.out.println(value);
        }

        // foreach dengan anonymous class
        System.out.println("----------------------------");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // Lambda
        System.out.println("----------------------------");
        list.forEach(value -> System.out.println(value));

        // Lambda method reference
        System.out.println("----------------------------");
        list.forEach(System.out::println);

    }
}
