package com.turgaydede.streamApi;

import java.util.Arrays;

public class LetterCount {
    public static void main(String[] args) {
        System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive("Turgay", "Dede", "Hello", "World", "I", "Love", "Java"));
    }

    //listedeki elemanlardan uzunluğu 5 ten büyük olanların toplam uzunluğunu döndür
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {

        return Arrays.stream(names)
                .filter(name -> name.length() > 5)
                .mapToInt(String::length)
                .sum();
    }
}
