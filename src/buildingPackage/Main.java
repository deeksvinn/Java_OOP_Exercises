// 25. Write a Java program to create a class called "Building" with attributes for address, number of floors, and total area. 
// Create subclasses "ResidentialBuilding" and "CommercialBuilding" that add specific attributes like number of apartments for 
// residential and office space for commercial buildings. Implement a method to calculate the total rent for each subclass.

package buildingPackage;

public class Main {
	
	public static void main(String[] args) {
		
		// initializing ResidentialBuilding and CommercialBuilding
		
		ResidentialBuilding residentialBuilding = new ResidentialBuilding("10, Downing Street",5,3000,10,3500);
		
		CommercialBuilding commercialBuilding = new CommercialBuilding("35, Kensington road",3,5000,6000,50);
		
		// Printing the detail after calculating the rent
		
		System.out.println("Residential building details are as follows :");
		residentialBuilding.displayBuildingDetails();
		
		System.out.println("\nCommercial building details are as follows :");
		commercialBuilding.displayBuildingDetails();
	}
}
