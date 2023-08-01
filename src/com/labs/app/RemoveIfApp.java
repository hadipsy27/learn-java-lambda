package com.labs.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(List.of("Hadi", "Kurniawan", "Indran", "Dika"));

        System.out.println("==============================================");
        System.out.println("Mencetak data yg tidak lebih dari 5 karakter");
        System.out.println("");

        System.out.println("List nya yaitu :");
        System.out.println(list);
        System.out.println("==============================================");
        System.out.println("");

        // problem to print data if data > 5
        System.out.println("Gagal!, menggunakan for each loop biasa");
        System.out.println("yang tercetak malah karakter yang lebih dari 5");
        System.out.println();
        for (var value : list) {
            if (value.length() > 5){
                System.out.println(value);
            }
        }


        System.out.println("-----------------------------");
        System.out.println("Gagal!, menggunakan for loop biasa");
        System.out.println("yang tercetak malah karakter yang lebih dari 5");
        System.out.println();
        for(int i =0; i < list.size(); i++) {
            if (list.get(i).length() > 5) {
                System.out.println(list.get(i));
            }
        }

        // Remove if anonymous class
        System.out.println("-----------------------------");
        System.out.println("Berhasil, Menggunakan Anonymous class");
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.length() > 5;
            }
        });
        System.out.println(list);
        System.out.println();


        // lambda
        System.out.println("-----------------------------");
        System.out.println("Berhasil, Menggunakan lambda");
        list.removeIf(name -> name.length() > 5);
        System.out.println(list);


        // foreach
        System.out.println("-----------------------------");
        System.out.println("Berhasil!, menggunakan for each loop biasa");
        for (var value : list) {
            if (value.length() < 5){
                System.out.println(value);
            }
        }

        // for loop biasa
        System.out.println("-----------------------------");
        System.out.println("Berhasil!, menggunakan for loop biasa");
        for(int i =0; i < list.size(); i++) {
            if (list.get(i).length() < 5) {
                System.out.println(list.get(i));
            }
        }
    }
}
