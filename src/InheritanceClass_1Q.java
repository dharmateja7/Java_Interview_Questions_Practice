/**
 * Inheritance : Using inheritance means defining a parent-child relationship between classes, by doing so, you can reuse the code that is already defined in the parent class. 
 * Code reusability is the biggest advantage of Inheritance.
 * 
 * Java does not allow multiple inheritance through classes but it allows it through interfaces.
 * **/

// Parent Class
class Vehicle{
	// Fields 
	String brand;
	int year;
	
	// Constructor
	public Vehicle(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}
	
	// Method
	public void drive() {
		System.out.println("Vehicle is driving...");
	}
}

// Child class (inherits from Vehicle)
class Car extends Vehicle {
	// Additional field
	int numberOfDoors;
	
	// Constructor
	public Car(String brand, int year, int numberOfDoors) {
		// call parent class constructor
		super(brand, year);
		this.numberOfDoors = numberOfDoors;
	}
	
	// Method Overriding
	@Override
	public void drive() {
		System.out.println("Car is driving...");
	}
	
	// Additional method
	public void honk() {
		System.out.println("Car is honking...");
	}
}

public class InheritanceClass_1Q {
	public static void main(String[] args) {
		// Creating an object of car
		Car mycar = new Car("Toyota", 2020, 4);
		
		// Accessing fields and methods
		System.out.println("Car brand: "+ mycar.brand);
		System.out.println("Car year: "+ mycar.year);
		System.out.println("Number of doors: "+ mycar.numberOfDoors);
		
		mycar.drive();// Calls overridden method
		mycar.honk();// Calls method defined in car class
		
		/**
		 * In Java, once a method is overridden in a child class, 
		 * you cannot directly call the parent class’s method on an instance of the child class. 
		 * However, you can create a separate instance of the parent class and call the method on that instance.
		 * Here’s how you can do it:
		 * **/
		
		// Creating an object of Vehicle
        Vehicle myVehicle = new Vehicle("Toyota", 2020);
        // Accessing method from parent class
        myVehicle.drive(); // Calls method from Vehicle class
	}
}
