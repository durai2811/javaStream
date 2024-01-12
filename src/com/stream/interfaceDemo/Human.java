package com.stream.interfaceDemo;

public class Human implements LivingThing{
    @Override
    public void canEat() {
        System.out.println("Human can eat");
    }

    @Override
    public void canSpeak() {
        System.out.println("Human can speak");
    }

    @Override
    public void canWalk() {
        System.out.println("Human can walk");
    }

    @Override
    public void canDoWork() {
        System.out.println("Human can do work");
    }

    @Override
    public void canFly()  {
        // but can not fly
        throw new RuntimeException("Human can not fly");
    }
}

class Bird implements LivingThing{

    @Override
    public void canEat() {
        System.out.println("bird can eat");
    }

    @Override
    public void canSpeak() {
       throw new RuntimeException("bird can not be speak");
    }

    @Override
    public void canWalk() {
        System.out.println("bird can walk");

    }

    @Override
    public void canDoWork() {
        throw new RuntimeException("bird can not do word");
    }

    @Override
    public void canFly()  {
        System.out.println("Bird can fly");
    }
}
interface LivingThing{
    void canEat();
    void canSpeak();
    void canWalk();
    void canDoWork();
    void canFly();
}