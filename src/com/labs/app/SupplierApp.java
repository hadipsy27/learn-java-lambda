package com.labs.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Hadi Prasetyo";
            }
        };

        System.out.println(supplier.get());
        System.out.println("--------------------------------");

        Supplier<String> supplier1 = () -> "Andi Suryanto";
        System.out.println(supplier1.get());
    }
}
