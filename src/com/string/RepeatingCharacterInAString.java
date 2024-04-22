package com.string;

import java.util.HashMap;
import java.util.Map;

public class RepeatingCharacterInAString {
    public static void main(String[] args) {
        String sampleString ="This is Java Programming Language";
        Map<Character, Integer> output = new HashMap<>();
        for (int i=0; i< sampleString.length();i++){
            if(output.get(sampleString.charAt(i)) !=null){
                output.put(sampleString.charAt(i), output.get(sampleString.charAt(i))+1);
            }else{
                output.put(sampleString.charAt(i),1);
            }
        }
        System.out.println(output);
    }
}
