package com.labs.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("first_name", "Hadi");
        map.put("last_name", "Prasetyo");
        map.put("metal_name", "Chosaku");

        // for loop
        for(var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("--------------------------------");

        // foreach anonymous class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ":" + value);
            }
        });

        System.out.println("--------------------------------");

        // lambda
        map.forEach((key, value) -> System.out.println(key + ":" + value));

    }
}
