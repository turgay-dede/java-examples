package com.turgaydede.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {

        mapToUpperCase("hello","world","and","i","love","java");
        mapToUpperCaseStream("hello","world","and","i","love","java");

    }

    public static Collection<String> mapToUpperCase(String... names) {
        Collection<String> upperCaseNames = new ArrayList<>();
        for (String name : names) {
            upperCaseNames.add(name.toUpperCase());
            System.out.println(name);
        }
        return upperCaseNames;
    }

    public static Collection<String> mapToUpperCaseStream(String... names) {
       return  Arrays.stream(names).map(name->name.toUpperCase()).collect(Collectors.toList());
    }
}
