package com.turgaydede.streamApi;

import java.util.ArrayList;
import java.util.List;

public class SumAndReduce {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(23);
        numbers.add(62);
        numbers.add(37);
        System.out.println(calculate(numbers));
        System.out.println(calculateReduce(numbers));

    }

    public static int calculate(List<Integer> numbers){
        int total = 0;
        for (int number : numbers){
            total += number;
        }
        return total;
    }

    public static int calculateReduce(List<Integer> numbers){
        return numbers.stream().reduce((acc,sum)->acc+sum).orElse(0);
    }
}
