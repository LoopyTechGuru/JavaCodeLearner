package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElementInAnArray {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Midhun", "Balan", "Nithin", "Balan");
        Map<String, Long> response=
                data.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(response);
    }
}
