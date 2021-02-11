package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Andrew", "Robinovich", Gender.MALE);
        Person person2 = new Person("Olga", "Teplouhova", Gender.FEMALE);
        Person person3 = new Person("David", "Brown", Gender.MALE);
        Person person4 = new Person("Olga", "Teplouhova", Gender.FEMALE);
        Person person5 = new Person("Andrew", "Robinovich", Gender.MALE);


        Set<Person> Person = new HashSet<>();
        Person.add(person1);
        Person.add(person2);
        Person.add(person3);
        Person.add(person4);
        Person.add(person5);

        for(Object o: Person){
            System.out.println(o);
        }

        System.out.println("Всего уникальных элемента в коллекции: " + Person.size());












    }
}
