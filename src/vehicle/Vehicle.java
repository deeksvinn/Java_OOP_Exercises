// 21. Write a Java program to create a class called "Vehicle" with attributes for make, model, and year.
// Create subclasses "Car" and "Truck" that add specific attributes like trunk size for cars and payload 
// capacity for trucks. Implement a method to display vehicle details in each subclass.

package vehicle;

public class Vehicle {
	
	private String make;
	private String model;
	private int year;

	// Constructor for Vehicle class
	
	public Vehicle(String make, String model, int year) {
		
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	// Getters and setters for make,model and year
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	// Method to display details of the vehicle
	
	public void displayDetails() {
		
		System.out.println("\nVehicle Details: ");
		System.out.println("Make of the vehicle: " + make);
		System.out.println("Model of the vehicle: "+ model);
		System.out.println("Year the vehicle is made: "+ year);
		
		
	}
}
