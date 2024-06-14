
//Abstract class:-
//Hiding the Implementation details and showing only functionality to user.

abstract class Shape{
	//Abstarct method (does not have body)
	public abstract void darw();
}

//Rectangle class (inherits from shape)
class Rectangle extends Shape{
	// Implementation of draw() method
	public void darw() {
		System.out.println("Drawing Rectangle");
		
	}
}

//Circle class (inherits from shape)
class Circle extends Shape{
	// Implementation of draw() method from shape
	public void darw() {
		System.out.println("Drawing Circle");
		
	}
 }

public class AbstractClass_1Q {
	public static void main(String [] args) {
		// Creating the objects of Rectangle and circle
		Shape rect = new Rectangle();
		Shape circle = new Circle();
		
		// Calling draw() method from Rectangle and Circle
		rect.darw();
		circle.darw();
	}
}
