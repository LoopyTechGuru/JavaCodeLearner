package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * INPUT: [1, 2, 3, 4, 5]
 * OUTPUT: {false=[1, 3, 5], true=[2, 4]}
 */
public class FindOddAndEvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Map<Boolean, List<Integer>> response =
                numbers.stream().collect(Collectors.partitioningBy(i-> i%2==0));
        System.out.println(response);
    }
}
