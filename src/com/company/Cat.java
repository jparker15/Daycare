package com.company;

public class Cat extends Animal{
    String pattern;
    boolean isStray;
    //custom field

    public Cat(int legs, int size, boolean isFixed,String name,String pattern, boolean isStray){
        super(legs,size,isFixed,name);
        this.pattern = pattern;
        this.isStray = isStray;
    }
    @Override
    public void speak(){
        System.out.println("Nyaaa!");
    }

}
