package com.string;

public class StringReverseByWords {
    public static void main(String[] args) {
        String str="Java Programming";
        String[] words = str.split(" ");
        String output ="";

        for (int i=0; i< words.length; i++){
            String word = words[i];
            String rev="";
            for (int j=0; j<word.length(); j++){
                rev = word.charAt(j)+rev;
            }
            output= output+ " "+rev;
        }
        System.out.println(output);
    }
}
