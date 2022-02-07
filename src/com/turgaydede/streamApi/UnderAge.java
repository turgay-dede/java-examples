package com.turgaydede.streamApi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnderAge {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Turgay",26,"TR");
        Person person2 = new Person("Ali",16,"ENG");
        Person person3 = new Person("Ayşe",56,"ABD");
        Person person4 = new Person("Kemal",6,"TR");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        System.out.println(getKidNames(people));
        System.out.println(getKidNamesToSet(people));

    }

    public static Set<String> getKidNames(List<Person> people){
        Set<String> kids = new HashSet<>();
        for(Person person : people){
            if(person.getAge() < 18){
                kids.add(person.getName());
            }
        }
        return kids;
    }

    public static Set<String> getKidNamesToSet(List<Person> people){
        return people.stream()
                .filter(person -> person.getAge() < 18)
                .map(person -> person.getName())
                .collect(Collectors.toSet());
    }

}
