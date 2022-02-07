package com.turgaydede.streamApi;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream()
                .filter(sayi -> sayi % 2 == 0)
                .forEach(sayi -> System.out.println(sayi + 1));
    }

}
