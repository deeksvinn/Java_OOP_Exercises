// ElectronicsProduct: This is subclass WashingMachine with super class ElectronicsProduct which has attribute warranty period
// and methods to extend the warranty period and override methods to apply discount,get final price na ddisplay product details

package electronicsPackage;

public class WashingMachine extends ElectronicsProduct {
	
	public int warrantyPeriod;
	
	// Constructor with super class attributes and warranty period
	
	public WashingMachine(String productId,String productName,double productPrice) {
		
		super(productId,productName,productPrice);
		this.warrantyPeriod = warrantyPeriod;
	}
	
	// Getter and setter for warranty period
	
	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}
	
	// Method to extend warranty
	
	public int extendWarranty(int extraYears) {
		
		warrantyPeriod += extraYears;
		return warrantyPeriod;
	}

	// Override method to apply discount
	
	@Override
	public void applyDiscount(double discount) {
		
		super.applyDiscount(discount);
	}

	// Override method to get final product price
	
	@Override
	public double finalProductPrice() {
		
		return productPrice;
		
	}
	
	// Override method to display product details
	
	@Override
	public void displayProductDetails() {
		
		super.displayProductDetails();
		
		System.out.println("Warranty Period:" + warrantyPeriod);
	}	
}
