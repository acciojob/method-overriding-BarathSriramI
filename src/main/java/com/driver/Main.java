package com.driver;

public class Main {
    public static void main(String[] args) {

        B b= new B();
        b.meth();

        // overriden

        B a= new B();
        a.meth();
//        System.out.println(a.meth());

    }
}