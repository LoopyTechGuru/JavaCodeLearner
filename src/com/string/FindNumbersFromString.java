package com.string;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNumbersFromString {
    public static void main(String[] args) {
        String str = "Midhun 1111 Balan 1234";
        List<Integer> list = getNumberFromString("Midhun 1111 Balan 1234");
        System.out.println(list);

        //With isDigit Method
        String response = getDigitValues(str);
        System.out.println(response);
    }

    // Using Pattern
    public static List<Integer> getNumberFromString(String str){
        List<Integer> numberList = new ArrayList<>();
        Pattern pattern= Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            numberList.add(Integer.parseInt(matcher.group()));
        }
        return numberList;
    }

    public static String getDigitValues(String str){
        //String str = "Midhun 1111 Balan 1234";
        String numbers = "";

        for(int i=0; i< str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                numbers += str.charAt(i);
            }
        }
        return numbers;
    }
}
