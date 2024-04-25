package com.oops.polymorphism;

public class MethodOverloading {
    public void method(){
        System.out.println("method called without argument");
    }
    public void method(int a){
        System.out.println("method called with int argument: "+a);
    }
    public void method(double a){
        System.out.println("method called with double argument: "+a);
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.method();
        methodOverloading.method(1);
        methodOverloading.method(1.1);
        methodOverloading.method('a');
    }
}
