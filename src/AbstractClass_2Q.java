/**
 * A class that is declared using “abstract” keyword is known as abstract class. It can have abstract methods (methods without body) as well as concrete methods (methods with body).
 * Some points to remember:
 * - An abstract class cannot be instantiated, which means you are not allowed to create an object of the abstract class. 
 * This also means, an abstract class has no use unless it is extended by some other class
 * - If there is any abstract method in a class then that class must be declared abstract
 * - The first non-abstract class which is extending from an abstract class will have to give implementation of the abstract methods defined in abstract class
 */

// Abstract class
abstract class Shapes{
    // Abstract method (mo implementation)
    public abstract double area();

    // Concrete method
    public void display() {
        System.out.println("This is a shape from abstarct class");
    }
}

//Concrete sub-class
class Rectangles extends Shapes{
    private double width;
    private double height;

    public Rectangles(double width, double height){
        this.width = width;
        this.height = height;
    }

    // Implemetation of the abstract method
    @Override
    public double area() {
        return width * height;
    }
}

// Concrete subclass
class Circles extends Shapes {
    private double radius;

    public Circles(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}

public class AbstractClass_2Q {
    public static void main(String [] args){
        Shapes recShape = new Rectangles(5,3);
        Shapes cirShape = new Circles(4);

        recShape.display();
        System.out.println("Area of rectangle: " + recShape.area());

        cirShape.display();
        System.out.println("Area of circle: " + cirShape.area());
    }
}
