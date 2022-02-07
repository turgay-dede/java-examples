package com.turgaydede.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Integer a = null;
        String name = "Turgay";

        // Optional<String> stringOptional = Optional.of("MALE");
        Optional<Integer> integerOptional = Optional.ofNullable(a);

        System.out.println("getName works");
        getName(name);

        System.out.println("getNameNestedOptional works");
        getNameNestedOptional(name);  

        System.out.println("getNameNestedOptionalFlatMap works");
        getNameNestedOptionalFlatMap(name);

        System.out.println("getNameFilter works");
        getNameFilter(name);

        System.out.println("getNameIsPresent works");
        getNameIsPresent(name);

        System.out.println("getNameIsEmpty works");
        getNameIsEmpty(name);

        System.out.println("getNameIfPresent works");
        getNameIfPresent(name);

        System.out.println("getNameIfPresentOrElse works");
        getNameIfPresentOrElse(name);
    }

    public static void getName(String name) {
        Optional<String> stringOptional = Optional.ofNullable(name);
        System.out.println(
                stringOptional
                        .map(String::toUpperCase) // Optinal<String>
                        .orElse("")); // String
    }

    public static void getNameNestedOptional(String name) {
        Optional<String> stringOptional = Optional.ofNullable(name);

        Optional<Optional<String>> optionalStringOptional = Optional.of(stringOptional);
        System.out.println(
                optionalStringOptional
                        .map(x -> x.map(String::toUpperCase)) // Optional<Optional<String>>
                        .orElse(Optional.ofNullable("")) // Optional<String>
                        .orElse("")); // String
    }

    public static void getNameNestedOptionalFlatMap(String name) {
        Optional<String> stringOptional = Optional.ofNullable(name);

        Optional<Optional<String>> optionalStringOptional = Optional.of(stringOptional);
        System.out.println(
                optionalStringOptional
                        .flatMap(x -> x.map(String::toUpperCase)) // Optinal<String>
                        .orElse(""));
    }

    public static void getNameFilter(String name) {
        Optional<String> stringOptional = Optional.ofNullable(name);

        System.out.println(
                stringOptional
                        .filter(x -> x.length() > 3 && x.startsWith("T"))
                        .orElse("")
        );
    }

    public static void getNameIsPresent(String name) {
        Optional<String> stringOptional = Optional.ofNullable(name);
        if (stringOptional.isPresent()) {
            System.out.println(stringOptional.get());
        } else {
            System.out.println("No name entered");
        }
    }

    public static void getNameIsEmpty(String name) {
        Optional<String> stringOptional = Optional.ofNullable(name);
        if (!stringOptional.isEmpty()) {
            System.out.println(stringOptional.get());
        } else {
            System.out.println("No name entered");
        }
    }

    public static void getNameIfPresent(String name) {
        Optional<String> stringOptional = Optional.ofNullable(name);
        stringOptional.ifPresent(System.out::println); // Null değilse çalışacak void metod çalışır
    }

    public static void getNameIfPresentOrElse(String name) {
        Optional<String> stringOptional = Optional.ofNullable(name);
        stringOptional.ifPresentOrElse(System.out::println,
                () -> System.out.println("İsim girilmedi")
        ); // Null değilse çalışacak void metod çalışır
    }
}
