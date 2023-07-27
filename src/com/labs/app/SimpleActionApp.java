package com.labs.app;

import com.labs.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        // Anonymous class
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action() {
                return "Hadi";
            }
        };

        System.out.println(simpleAction1.action());


        // contoh menggunakan lambda
        SimpleAction simpleAction2 = () -> {
            return "Prasetyo";
        };

        System.out.println(simpleAction2.action());
    }
}