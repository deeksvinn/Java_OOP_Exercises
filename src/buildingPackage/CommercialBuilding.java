// Building: This is sub class CommercialBuilding to super class Building which has commercial building details.
// It has added attributes of office space and rent per square meter and a method to calculate total rent
// and override method from super class display building details.

package buildingPackage;

public class CommercialBuilding extends Building  {
	
	double officeSpace;
	double rentPerSquareMeter;
	
	// Constructor 
	
	public CommercialBuilding(String address,int numFloors,double totalArea,double officeSpace,double rentPerSquareMeter) {
		super(address, numFloors, totalArea);
		this.officeSpace = officeSpace;
		this.rentPerSquareMeter = rentPerSquareMeter;	
	}
	
	// Getters and setters for officeSpace and rentPerSquareMeter
	
	public double getOfficeSpace() {
		return officeSpace;
	}

	public void setOfficeSpace(double officeSpace) {
		this.officeSpace = officeSpace;
	}

	public double getRentPerSquareMeter() {
		return rentPerSquareMeter;
	}

	public void setRentPerSquareMeter(double rentPerSquareMeter) {
		this.rentPerSquareMeter = rentPerSquareMeter;
	}
	
	// Method to calculate rent for office space
	
	public double calculateTotalRent() {
		return officeSpace * rentPerSquareMeter; 
	}

	// Override method to display building details
	
	@Override
	public void displayBuildingDetails() {
	
		super.displayBuildingDetails();
		System.out.println("Office Space: " + officeSpace);
		System.out.println("Rent per square meter: " + rentPerSquareMeter);
		System.out.println("Total rent: " + calculateTotalRent());
	}
}
