package com.epam.test.abstaction;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Pet {
    String colour;

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(String name, int age, String colour) {
        super(name, age);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Gav", 5);
        Dog dog1 = new Dog("Tar", 4, "Grey");
        System.out.println(dog1);
        Pet dog2 = new Dog("Tar", 4, "Grey");
        //dog2.getColour();
        System.out.println(dog2);
        Cat cat = new Cat("Leo", 6, 120);
        System.out.println(cat);

        ArrayList<Pet> pets = new ArrayList<Pet>();
        pets.add(dog1);
        pets.add(dog2);
        pets.add(cat);
        System.out.println(pets.size());
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "colour" + " " + colour;
    }
}
