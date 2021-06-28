package com.company;

public class Animal {
    int legs;
    int size;
    boolean isFixed;
    String name;

    public Animal (int legs, int size, boolean isFixed, String name){
        this.legs = legs;
        this.size = size;
        this.isFixed = isFixed;
        this.name = name;
    }

    public void speak(){
        System.out.println("---");
    }


    @Override
    public String toString(){
        return String.format("name:" + name +"\n" + "size(cm):" + size + "\n" + "Fixed:"+ isFixed + "\n" + "legs:" +  legs);
    }
}
