/*
 * Polymorphism : Poly means many and Morph means forms. 
 * Polymorphism is the process in which an object or function takes different forms. There are 2 types of Polymorphism :
 * - Run Time Polymorphism (Method Overriding)
 * 
 * Overriding means when we have two methods with same name and same parameters in parent and child class. 
 * Through overriding, child class can provide specific implementation for the method which is already defined in the parent class.
 */

 class Animal{
    public void makeSound() {
        System.out.println("Animals makes a sound");
    }
 }

 class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
 }

 class Cat extends Animal{
    public void makeSound() {
        System.out.println("Cat meows");
    }
 }


public class Polymorphism_1Q_RunTime {
    public static void main (String [] args){
        Animal myDog = new Dog();// Upcasting
        Animal myCat = new Cat();// Upcatsing

        myDog.makeSound();
        myCat.makeSound();
    }
}
