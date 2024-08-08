// Building: This is sub class ResidentialBuilding for Building super class which has residential building details.
// It has added attributes of number of apartments and rent per apartment and a method to calculate total rent
// and override method from super class display building details.

package buildingPackage;

public class ResidentialBuilding extends Building {
	
	public int numApartments;
	public double rentOfApartment;
	
	// Constructor

	public ResidentialBuilding(String address, int numFloors, double totalArea,int numApartments,int rentOfApartment ) {
		
		super(address,numFloors, totalArea);
		this.numApartments = numApartments;
		this.rentOfApartment = rentOfApartment; 
	}

	// Method to calculate rent for apartment
	
	public double calculateRent() {
		return numApartments * rentOfApartment;
	}
	
	// Override method to display building details
	
	@Override
	public void displayBuildingDetails() {
		
		super.displayBuildingDetails();
		System.out.println("Number of apartments : " + numApartments);
		System.out.println("Rent of each apartment : " + rentOfApartment);
		System.out.println("Total rent for apartments : " + calculateRent());
	}
}
