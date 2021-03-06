package com.company;


import java.util.List;

public class DogPark{

    public static void addAnimal (List animals, Animal animal){
        animals.add(animal);
    }

    public static void displayAnimals(List animals ){
        System.out.println("------");

        for (Object a: animals){
            if(a instanceof Cat){
                System.out.println("Cat--");
            }
            if(a instanceof Dog){
                System.out.println("Dog--");
            }
            System.out.println(a+"\n");

        }
    }

    /*

    Static Method removeAnimal should take a name and an Animal list.
    The method should go through and find the animal with
    the same name then remove that animal from the list.*/
    public static void removeAnimals(List<Animal> animals, String name){

        animals.removeIf(animal -> animal.name.equals(name));

//            for(Animal animal: animals){
//                if(animal.name.equals(name)){
//                    animals.remove(animal);
//                }
//            }


    }


}