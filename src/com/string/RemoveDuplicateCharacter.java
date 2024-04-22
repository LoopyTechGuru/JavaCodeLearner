package com.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        System.out.println(removeDuplicateCharacter("hello"));
    }
    public static StringBuilder removeDuplicateCharacter(String str){
        Set<Character> charSet = new HashSet<>();
        StringBuilder strBuilder = new StringBuilder();

        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(!charSet.contains(ch)){
                charSet.add(ch);
                strBuilder.append(ch);
            }
        }
        return strBuilder;
    }
}
