package com.labs.app;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class OptionalApp {
    public static void main(String[] args) {

        sayHello("hadi");

        String name = null;
        sayHello(name);


        System.out.println("-----------------------------------");

        sayHelloWithLambda("Kucing");
        sayHelloWithLambda(null);

        System.out.println("-----------------------------------");
//        sayHelloWithMethodReference("Dika");
        sayHelloWithMethodReference(null);

        System.out.println("-----------------------------------");
        sayHelloWithForLoop("Ayam");
        sayHelloWithForLoop(null);

    }

    public static void sayHello(String name){
        Optional<String> optionalName = Optional.ofNullable(name);
        Optional<String> optionalNameUpper = optionalName.map(new Function<String, String>() {
            @Override
            public String apply(String value) {
                return value.toUpperCase();
            }
        });
        optionalNameUpper.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println("HELLO " + value);
            }
        });
    }

    public static void sayHelloWithLambda(String name){
        Optional<String> optionalName = Optional.ofNullable(name);
        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
        optionalNameUpper.ifPresent(value -> System.out.println("HELLO " + value));
    }

    public static void sayHelloWithMethodReference(String name){
        // method reference
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresent(value -> System.out.println("HELLO " + value));

        // method reference with or Else
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(value -> System.out.println("HELLO " + value),
//                        () -> System.out.println("HELLO")
//                );


        // menggunakan orElseGet -> lazy parameter
        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElseGet(OptionalApp::getDefaultName);

        System.out.println("HELLO " + upperName);
    }

    public static String getDefaultName() {
        System.out.println("Menjalankan method getDefaultName() -> lazy parameter");
        return "TEMAN";
    }

    public static void sayHelloWithForLoop(String name){
        if (name != null){
            System.out.println("HELLO " + name);
        }
    }


}
