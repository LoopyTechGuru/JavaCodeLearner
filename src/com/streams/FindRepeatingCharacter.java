package com.streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRepeatingCharacter {
    public static void main(String[] args) {
        String textValue = "Java programming language";
        Map<Character, Long> repeatingChars=  textValue.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(repeatingChars);
    }
}
