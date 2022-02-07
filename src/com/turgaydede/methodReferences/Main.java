package com.turgaydede.methodReferences;

import java.util.function.Consumer;
/**
 * Static      -> TypeName::methodName  -> System.out::println
 * Object      -> object::methodName    -> book:setAuthorFName
 * Class       -> Class::methodName     -> Book::toString
 * Constructor -> Class::new            -> Date::new
 * */
public class Main {
    public static void main(String[] args) {

        Consumer<String> print1 = (s1) -> System.out.println(s1);
        print1.accept("Hello world!");

        Consumer<String> print2 = System.out::println;
        print2.accept("Hello method references!");

    }
}
