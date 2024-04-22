package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromAList {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("Midhun","Balan", "Nithin", "Balan");
        List noDuplciate = elements.stream().distinct().collect(Collectors.toList());
        System.out.println(noDuplciate);
    }
}
