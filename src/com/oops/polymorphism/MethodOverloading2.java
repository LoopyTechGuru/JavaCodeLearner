package com.oops.polymorphism;

public class MethodOverloading2 {
    public void method(String str){
        System.out.println("string method executed"+str);
    }
    public void method(StringBuffer str){
        System.out.println("StringBuffer method executed"+str);
    }

    public static void main(String[] args) {
        MethodOverloading2 methodOverloading2= new MethodOverloading2();
        methodOverloading2.method("hello");
        methodOverloading2.method(new StringBuffer("midhun"));
        //methodOverloading2.method(null); //Ambiguous method call. Both

    }
}
