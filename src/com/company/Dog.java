package com.company;

public class Dog extends Animal {

    String breed;
    int snoutLength;
    // custom field

    public Dog(int legs, int size, boolean isFixed, String name, String breed,int snoutLength) {
        super(legs, size, isFixed, name);
        this.breed = breed;
        this.snoutLength = snoutLength;
    }

    @Override
    public void speak(){
        System.out.println("RawrXD");
    }
}
