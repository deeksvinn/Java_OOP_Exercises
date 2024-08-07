// Vehicle: This is subclass Car for Vehicle which has an added attribute of trunk size for car and 
// overrides the method displaydetails to display car details.

package vehicle;

public class Car extends Vehicle {
	
	private double trunkSize;

	// Constructor for car
	
	public Car(String make, String model, int year,double trunkSize) {
		
		super(make, model, year);
		this.trunkSize = trunkSize;
	}

	// Getter abd setter for trunksize
	
	public double getTrunkSize() {
		
		return trunkSize;
	}

	public void setTrunkSize(double trunkSize) {
		
		this.trunkSize = trunkSize;
	}
	
	// Override method displayDetails from Vehicle class to display details about the car
	
	@Override
	
	public void displayDetails() {
	
		super.displayDetails();
		System.out.println("Trunk size of the car :"+ trunkSize + " cublic feet");
	}
}



