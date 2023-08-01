package com.labs.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(List.of("Tia", "Hadi", "Kurniawan", "Indran", "Dika"));

        System.out.println("==============================================");
        System.out.println("Menghapus data yg lebih dari 5 karakter");
        System.out.println("");

        System.out.println("List nya yaitu :");
        System.out.println(list);
        System.out.println("==============================================");
        System.out.println("");

//        System.out.println("Gagal!, menghapus menggunakan for each loop biasa");
//        System.out.println();
//        for (var value : list) {
//            if (value.length() > 5){
//                list.remove(value);
//            }
//        }

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

    }
}
