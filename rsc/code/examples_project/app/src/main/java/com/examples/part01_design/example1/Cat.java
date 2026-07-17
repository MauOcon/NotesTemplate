package com.examples.part01_design.example1;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        meow();
    }
    private void meow() {
        System.out.println("Miau");
    }
}
