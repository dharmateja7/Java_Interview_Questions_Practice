/**
 * This is a famous interview question and the answer is: Yes, abstract classes have constructor. 
 * Either you can provide it or the default one will be provided by Java. 
 * Now, you must be wondering if you cannot create an object of abstract class then what is the need of a constructor.
 * One thing you must know is that the constructors are used when you are creating an object of a class, to initialize the data members of that class and your abstract class can have data members.
 * Now, when your class extends abstract class then the same abstract class will become super class for your extending class and remember 
 * when you have constructor of your class then first line of your constructor is always a call to super class constructor and this is the time when your abstract class constructor will get called.
 */

 abstract class Animalss{
    protected String name;

    // Constructor for Animalss class
    public Animalss(String name){
        this.name = name;
    }

    //Abstract method to be implemented by subclasses
    public abstract void makeSound();
 }

 class Dogs extends Animalss{
    public String breeds;

    // Constructor for Dogs subclass
    public Dogs(String name, String breeds){
        super(name); // calling the constructor of the abstract class (super class)
        this.breeds = breeds;
    }

    //Implementing abstract method
    public void makeSound(){
        System.out.println("woof!");
    }
 }


class AbstractClass_Constructor_3Q {
    public static void main(String [] args){
        Dogs dogssDogs =  new Dogs("Buddy", "Golden retriever");
        System.out.println("Name: " + dogssDogs.name);
        System.out.println("Breed:    " + dogssDogs.breeds);
        dogssDogs.makeSound();
    }
}