package Polymorphism;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        animal myCat = new Cat();
        animal myDog = new Dog();

        myCat.makeSound();
        myDog.makeSound();
    }
}