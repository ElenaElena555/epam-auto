package com.epam.test.abstaction;

public abstract class Pet {
    String name;
    int age;

    public Pet(String name1, int age1) {
        name = name1;
        age = age1;
    }

    public Pet() {
    }

    @Override
    public String toString() {
        return "name" + " "+ name + " "+
                "age" + age;
    }
}
