package com.turgaydede.streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxAndComparator {
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
        System.out.println(getOldestPerson(people));
        System.out.println(getOldestPersonMax(people));

    }

    public static Person getOldestPerson(List<Person> people){
        Person oldestPerson = people.get(0);
        for (Person person : people){
            if(person.getAge() > oldestPerson.getAge()){
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    public static Person getOldestPersonMax(List<Person> people){
        return people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null);
    }


}
