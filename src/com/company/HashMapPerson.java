package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Andrew", "Robinovich", Gender.MALE);
        Person person2 = new Person("Olga", "Teplouhova", Gender.FEMALE);
        Person person3 = new Person("David", "Brown", Gender.MALE);
        Person person4 = new Person("Alizbet", "Pupkina", Gender.FEMALE);
        Person person5 = new Person("Malkin", "Mackallein", Gender.MALE);

        Map<Integer,Person> Person = new HashMap<>();
        Person.put(101, person1);
        Person.put(254, person2);
        Person.put(352, person3);
        Person.put(546, person4);
        Person.put(348, person5);

        Set set = Person.entrySet();
        for(Object o: Person.entrySet()){
            System.out.println(o);
        }
        System.out.println("Элементов в массиве: " + Person.size());


    }

}
