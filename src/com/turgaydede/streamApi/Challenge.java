package com.turgaydede.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 44);
        System.out.println(getString(list)); // "o3,e44"
    }

    public static String getString(List<Integer> list) {
        return list.stream()
                .map(i -> {
                            String s = "";
                            if (i % 2 == 0) {
                                s += "e" + i;
                            } else {
                                s += "o" + i;
                            }
                            return s;
                        }

                ).collect(Collectors.joining(","));
    }
}
