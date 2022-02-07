package com.turgaydede.streamApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
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
        System.out.println(groupByNationality(people));
        System.out.println(groupByNationalityGroupingBy(people));
    }

    public static Map<String, List<Person>> groupByNationality(List<Person> people) {
        Map<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
           if(!map.containsKey(person.getNationality())){
               map.put(person.getNationality(),new ArrayList<>());
           }
           map.get(person.getNationality()).add(person);
        }
        return map;
    }

    public static Map<String, List<Person>> groupByNationalityGroupingBy(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(Person::getNationality, Collectors.toList()));
    }
}
