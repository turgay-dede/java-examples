package com.turgaydede.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Turgay", 26, "TR");
        Person person2 = new Person("Ali", 16, "ENG");
        Person person3 = new Person("Ayşe", 56, "ABD");
        Person person4 = new Person("Kemal", 6, "TR");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        System.out.println(namesToString(people));
        System.out.println(namesToStringJoining(people));

    }

    public static String namesToString(List<Person> people) {
        String label = "Names: ";
        StringBuilder stringBuilder = new StringBuilder(label);
        for (Person person : people) {
            if (stringBuilder.length() > label.length()) {
                stringBuilder.append(". ");
            }
            stringBuilder.append(person.getName());
        }
        stringBuilder.append(".");
        return stringBuilder.toString();
    }

    public static String namesToStringJoining(List<Person> people) {
        return "Names: " + people.stream()
                .map(Person::getName)
                .collect(Collectors.joining(". ")) + ".";

    }
}
