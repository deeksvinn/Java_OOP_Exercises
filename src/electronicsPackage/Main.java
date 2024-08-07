// 24. Write a Java program to create a class called "ElectronicsProduct" with attributes for 
// product ID, name, and price. Implement methods to apply a discount and calculate the final price.
// Create a subclass " WashingMachine" that adds a warranty period attribute and a method to extend the warranty.

// This is Main class for electronics product

package electronicsPackage;

public class Main {

	public static void main(String[] args) {
		
		// Initializing electronicsproduct and washingMachine 
		
		ElectronicsProduct electronics = new ElectronicsProduct("EX100", "Samsung robot vacuum",599);
		
		WashingMachine washingMachine = new WashingMachine("4A23", "Bosch",600);
		
		// Printing electronic product details, applying discount and printing final price
		
		System.out.println("Electronics product details : ");
		
		electronics.displayProductDetails();
		
		electronics.applyDiscount(10);
		
		System.out.println("\n" + electronics.getProductName() + " final price after applying discount is " + electronics.finalProductPrice());
	
		// Printing washing machine details, applying discount and printing final price,warranty period and extended warranty period
		
		System.out.println("\nWashing machine details : ");
		
		washingMachine.displayProductDetails();
		
		washingMachine.applyDiscount(20);
		
		System.out.println("\nFinal price of the washing machine after applying discount is " + washingMachine.finalProductPrice());
		
		System.out.println("\nWarranty period for washing machine is "+ washingMachine.getWarrantyPeriod());
		
		System.out.println("\nExtended warranty period for washing machine is " + washingMachine.extendWarranty(2));
	}
}
