package com.company;
import java.util.ArrayList;


public class ArrayListPerson{
    public static void main(String[] args) {

        Person person1 = new Person("Andrew", "Robinovich", Gender.MALE);
        Person person2 = new Person("Olga", "Teplouhova", Gender.FEMALE);
        Person person3 = new Person("David", "Brown", Gender.MALE);
        Person person4 = new Person("Alizbet", "Pupkina", Gender.FEMALE);
        Person person5 = new Person("Andrew", "Robinovich", Gender.MALE);

        ArrayList<Person> Person = new ArrayList<>();

        Person.add(0, person1);
        Person.add(1, person2);
        Person.add(2, person3);
        Person.add(3, person4);
        Person.add(4, person5);

        for( int i = 0; i < Person.size(); i++){
            System.out.println(Person.get(i));
        }

        System.out.println("Элементов в коллекции: " + Person.size());


    }

}
