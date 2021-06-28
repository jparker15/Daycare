package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cat cat = new Cat(3,130,true,"Sassafras","Calico",true);
        Dog dog = new Dog(3,130,true,"Frankincense","Pit bull",12 );

        List list = new ArrayList<Animal>();

//        System.out.println(cat);
        DogPark.addAnimal(list, cat);
        DogPark.addAnimal(list, dog);
        DogPark.displayAnimals(list);
        DogPark.removeAnimals(list,dog);
        DogPark.removeAnimals(list,cat);
//        DogPark.displayAnimals(list);

    }
}
