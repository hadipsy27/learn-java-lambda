package com.labs.app;

import com.labs.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        // Anonymous class
//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action() {
//                return "Hadi";
//            }
//        };
//
//        System.out.println(simpleAction1.action());
//
//
//        // contoh menggunakan lambda
//        SimpleAction simpleAction2 = () -> {
//            return "Prasetyo";
//        };
//
//        System.out.println(simpleAction2.action());

        // ------------------------------------------------------------------------------

        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action(String name) {
                return "Hello " + name;
            }
        };
        System.out.println(simpleAction1.action("Hadi"));

        System.out.println("----------------------------------------------------------------");

        SimpleAction simpleAction2 = (String value) -> {
            return "Hello " + value;
        };
        System.out.println(simpleAction2.action("Andi"));

        System.out.println("----------------------------------------------------------------");
        SimpleAction simpleAction3 = (value -> {
            return "Hello " + value;
        });
        System.out.println(simpleAction3.action("Budi"));


        System.out.println("----------------------------------------------------------------");
        SimpleAction simpleAction4 = (String value) -> "Hello " + value;
        System.out.println(simpleAction4.action("Dika"));

        System.out.println("----------------------------------------------------------------");
        SimpleAction simpleAction5 = (value) -> "Hello " + value;
        System.out.println(simpleAction5.action("Angga"));

        System.out.println("----------------------------------------------------------------");
        SimpleAction simpleAction6 = value -> "Hello " + value;
        System.out.println(simpleAction6.action("Joko"));

    }
}