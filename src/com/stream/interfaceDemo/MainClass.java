package com.stream.interfaceDemo;

public class MainClass {
    public static void main(String[] args){
        LivingThing livingThing=new Human();
        livingThing.canDoWork();
        livingThing.canEat();
        livingThing.canWalk();
        livingThing.canSpeak();

        LivingThing thing =new Bird();
        //thing.canSpeak();
        thing.canWalk();
        thing.canFly();
        thing.canEat();
        //thing.canDoWork();
        //  livingThing.canFly(); human can't fly if need handle exception
    }
}
