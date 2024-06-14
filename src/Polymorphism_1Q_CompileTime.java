/**
 * Polymorphism : Poly means many and Morph means forms. 
 * Polymorphism is the process in which an object or function takes different forms. 
 * There are 2 types of Polymorphism :
 * 
 * -Compile Time Polymorphism (Method Overloading)
 * 
 * In Method overloading, two or more methods in one class have the same method name but different arguments. 
 * It is called as Compile time polymorphism because it is decided at compile time which overloaded method will be called.
 */

 class MathOPerations {
    // MEthod to add two integers
    public int add (int a, int b){
        return a + b;
    }

    // Method to add three integers
    public int add (int a, int b, int c){
        return a + b + c;
    }

    // MEthod to add two doubles
    public double add(double a, double b){
        return a + b;
    }
 }

public class Polymorphism_1Q_CompileTime {
    public static void main (String [] args){
        MathOPerations mathOPerations = new MathOPerations();

        System.out.println("Sum of 5 and 7 is: " + mathOPerations.add(5,7));
        System.out.println("Sum of 5,7 and 3 is: " + mathOPerations.add(5,7,3));
        System.out.println("Sum of 3.5 and 2.5 is: " + mathOPerations.add(3.5, 2.5));
    }
}
