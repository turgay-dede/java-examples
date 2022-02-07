package com.turgaydede.streamApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBy {
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
        System.out.println(partitionAdults(people));
        System.out.println(partitionAdultsPartition(people));

    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        Map<Boolean, List<Person>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());
        for (Person person : people) {
            map.get(person.getAge() >= 18).add(person);
        }
        return map;
    }

    public static Map<Boolean, List<Person>> partitionAdultsPartition(List<Person> people) {
        return people.stream()
                .collect(Collectors.partitioningBy(person -> person.getAge() >= 18));


    }
}
