package com.labs.app;

import com.labs.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

        // penggunaan method reference pada method static
        // Menggunakan Anonymous Class
        // Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);

        // Menggunakan Lambda Method reference
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("Hadi"));
        System.out.println(predicateIsLowerCase.test("hadi"));

        System.out.println("================================================");

        run2();

        System.out.println("----------------------------------------------------------------");
        Predicate<String> predicate = StringUtil::isLowerCase;
        System.out.println(predicate.test("Hadi"));
        System.out.println(predicate.test("hadi"));


        System.out.println("================================================");
        // Method Reference Parameter
        // Method ini tidak mempunyai parameter
        //Function<String, String> functionUpper = value -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;
        System.out.println(functionUpper.apply("Hadi"));

    }

    public void run(){
        // Penggunaan method reference yang non static

        // Penggunaan pada object yg ada pada class yg sama
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("Hadi"));
        System.out.println(predicateIsLowerCase.test("hadi"));
    }

    public static void run2(){
        // penggunaan method reference pada class yg berbeda / dengan inisialisasi class nya terlebih dahulu
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicateIsLowerCase = app::isLowerCase;

        System.out.println(predicateIsLowerCase.test("Hadi"));
        System.out.println(predicateIsLowerCase.test("hadi"));
    }


    public boolean isLowerCase(String value){
        for (var c : value.toCharArray()) {
            if(!Character.isLowerCase(c)) return false;
        }
        return true;
    }
}
