package com.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListInReverseOrder {
    public static void main(String[] args) {
        // Reverse number list
        List<Integer> intgerList = Arrays.asList(1, 2, 3, 4);
        Stream response = intgerList.stream().sorted(Comparator.reverseOrder());
        response.forEach(i-> System.out.print(i));

        // Reverse string list
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");

        ArrayList<String> reversedList = arrayList.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(reversedList);
    }
}
