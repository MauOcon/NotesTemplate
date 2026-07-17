package com.examples.part01_design.example1;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        bark();
    }

    public void bark() {
        System.out.println("Woof");
    }
}
