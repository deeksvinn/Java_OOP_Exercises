// Building: This is super class Building for sub classes residentialbuilding and commericialbuilding
// This class has attributes for address,number of fllors and total area. 
// This class has super class method to display building details which is override in sub classes.

package buildingPackage;

public class Building {
	
	public String address;
	public int numFloors;
	public double totalArea;

	// Constructor for address, numFloors and totalArea
	
	public Building(String address, int numFloors, double totalArea) {
	
		this.address = address;
		this.numFloors = numFloors;
		this.totalArea = totalArea;
	}

	// Getters and setters for address,numFloors and totalArea
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumFloors() {
		return numFloors;
	}

	public void setNumFloors(int numFloors) {
		this.numFloors = numFloors;
	}

	public double getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(double totalArea) {
		this.totalArea = totalArea;
	}
		
	// Super class method to display building details
	
	public void displayBuildingDetails() {
		System.out.println("Address: " + address);
		System.out.println("Number of floors : " + numFloors);
		System.out.println("Total area : " + totalArea);		
	}	
}
