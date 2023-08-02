package com.labs.app;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {

        testScore(90, () -> getName());

        System.out.println("--------------------------------");
        // menggunakan Lambda Method reference
        testScore(60, LazyApp::getName); // Method getName tidak di panggil karena desicion nya tidak terpenuhi

    }

    public static void testScore(int score, Supplier<String> name){
        if(score > 80){
            System.out.println("Selamat " + name.get() + " anda lulus");
        } else  {
            System.out.println("Coba lagi tahun depan");
        }
    }

    public static String getName(){
        System.out.println("Method getName() dipanggil");
        return  "Hadi";
    }
}
