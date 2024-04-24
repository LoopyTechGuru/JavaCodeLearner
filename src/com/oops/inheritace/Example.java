package com.oops.inheritace;

class A{
    public void sayHello(){
        System.out.println("Hello from class A");
    }
    public void sayHi(){
        System.out.println("Hi from class A");
    }
}

class B extends A{
    public void sayHello(){
        System.out.println("Hello from class B");
    }
}

public class Example extends B {
    public static void main(String[] args) {
        Example example = new Example();
        example.sayHello();
        example.sayHi();
    }
}
