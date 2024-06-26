package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinPrefixSuffixAndDelimiter {
    public static void main(String[] args)
    {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joinedString); // [Facebook, Twitter, YouTube, WhatsApp, LinkedIn]
    }
}
