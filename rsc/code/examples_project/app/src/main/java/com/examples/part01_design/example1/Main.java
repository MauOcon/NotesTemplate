package com.examples.part01_design.example1;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark();

        Animal animal = new Cat();
        animal.makeSound();

        Animal a = getAnimal();
        a.makeSound();
    }

    private static Animal getAnimal() {
        return new Cat();
    }
}
