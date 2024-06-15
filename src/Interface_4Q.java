/**
- An interface in Java is a blueprint of a class. It has static constants and abstract methods.
- Interface specify what a class must do but not how to do
- An interface is like defining a contract that is fulfilled by implementing classes
- An interface is used to achieve full abstraction.
- All methods in an interface are public and abstract by default and all variables declared in an interface are constants i.e. public, static and final
- A class which implements an interface will have to provide implementation of all the methods that are defined in the interface
- A class can implement more than one interface, this is how Java allows multiple inheritance.
- Since Java 8, we can have default and static methods in an interface
 */


interface Polygon{
    void getArea();

    // default method
    default void getSides() {
        System.out.println("I can get sides of a polygon");
    }

    //Static method
    static void getName(){
        System.out.println("Name is polygon");
    }
}

// Implements the interface 
class Rectangles implements Polygon{
    public void getArea(){
        int length = 6;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("The are of the rectangle is: "+ area);
    }

    // overrides the getSides
    public void getSides(){
        System.out.println("I have 4 sides.");
    }
}

class Squares implements Polygon{
    public void getArea(){
        int length = 5;
        int area = length * length;
        System.out .println("Thre area of the sqaure is: "+ area);
    }
}


class Interface_4Q {
    public static void main(String[] args) {
        // Create an object of Rectangle
        Rectangles rectangles = new Rectangles();
        rectangles.getArea();
        rectangles.getSides();

        // Create an object of square
        Squares squares = new Squares();
        squares.getArea();
        squares.getSides();

        // Static method call
        Polygon.getName();
    }
}