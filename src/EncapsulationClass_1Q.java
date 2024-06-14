/***** Encapsulation : Encapsulation is a process of Binding data and methods within a class . 
Think of it like showing the essential details of a class by using the access control 
modifiers (public, private, protected ). 
So, we can say that Encapsulation leads to the desired level of Abstraction. *****/

/**
 * Encapsulation is the concept of bundling data (variables) and methods (functions) that operate on the data into a single unit, called a class. 
 * It involves the hiding of the internal state of an object and restricting access to it from outside the class. 
 * This is typically achieved by declaring the data members of the class as private and providing public methods (getters and setters) to access and modify them. 
 * Encapsulation helps in achieving data hiding, abstraction, and modularity in object-oriented programming, making the code easier to maintain, understand, and reuse. 
 * It also provides control over the access to the internal state, allowing for data validation and ensuring the integrity of the object's state.
 * **/

class Employee {
	/** Private variables (Encapsulated)
	The Employee class encapsulates the data (name, age, salary) by making the variables private. This prevents direct access from outside the class.
	**/
	private String name;
	private int age;
	private double salary;
	
	// Constructor
	public Employee (String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	// Getter methods (to access private variables)
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	//Setter methods (to modify private variables)
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Invalid age.");
		}
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Invalid salary.");
		}
	}
}


public class EncapsulationClass_1Q {
	public static void main(String [] args) {
		// Creating an Employee Object
		Employee emp = new Employee("John", 31, 50000);
		
		// Accessing private variables using getter methods
		System.out.println("Name: "+ emp.getName());
		System.out.println("Age: "+ emp.getAge());
		System.out.println("Salary: "+ emp.getSalary());
		
		//Modifying private variables using setter methods
		emp.setName("Angalakuduru Dharma Teja");
		emp.setAge(32);
		emp.setSalary(60000);;
		
		// Displaying the updated information
		System.out.println("\nUpdated Information:");
		System.out.println("Name: "+ emp.getName());
		System.out.println("Age: "+ emp.getAge());
		System.out.println("Salary: "+ emp.getSalary());
	}
}
