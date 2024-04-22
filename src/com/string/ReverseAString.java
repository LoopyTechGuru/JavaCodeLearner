package com.string;

public class ReverseAString {
    public static void main(String[] args) {
        String data = "Java Programming";
        String rev="";
        for (int i=0; i<data.length(); i++){
            rev = data.charAt(i)+rev;
        }
        System.out.println(rev);
    }
}
