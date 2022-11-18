package com.epam.test.abstaction;

public class Cat extends Pet {
    int tall;

    public Cat(String name1, int age1) {
        super(name1, age1);
    }

    public Cat() {

    }

    public Cat(String name1, int age1, int tall) {
        super(name1, age1);
        this.tall = tall;
    }

    public int getTall() {
        return tall;
    }

    ;

    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat("Leo", 6);
        System.out.println(cat);
        System.out.println(cat1);

    }

    @Override
    public String toString() {
        return super.toString() + " tall" + " " + tall;
    }
}
