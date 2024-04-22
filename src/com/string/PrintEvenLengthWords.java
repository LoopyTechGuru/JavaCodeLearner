package com.string;

public class PrintEvenLengthWords {
    public static void main(String[] args) {
        String input ="This is a Java Language Tutorial";
        String[] words = input.split(" ");

        for (int i=0; i< words.length; i++){
            if (words[i].length()%2 == 0){
                System.out.println(words[i]);
            }
        }
    }
}
