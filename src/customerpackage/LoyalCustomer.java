// Customer: LoyalCustomer is a subclass for Customer which extends Customer class features and applies discount and adds it to the total expenditure

package customerpackage;

public class LoyalCustomer extends Customer {

	    private double discountRate;

	    // Constructor for LoyalCustomer 
	    
	    public LoyalCustomer(String name, String email,double discountRate) {
	    	
			super(name,email);
			this.discountRate = discountRate;
			
		}
	    
	    // Getter and setter for the discount rate
	    
	    public double getDiscountRate() {
	    	
	        return discountRate;
	    }
	    
		public void setDiscountRate(double discountRate) {
	        this.discountRate = discountRate;
	    }    

	    // Method to apply the discount on the retail amount for the loyal customer
	      
	    public double applyDiscount(double retailAmount) {
	    	
	        return retailAmount - (retailAmount * discountRate / 100);
	    }

	    // Override the addPurchase method from customer class to apply the discount before adding the purchase amount to the purchase history
	    
		@Override
		public void addPurchaseHistory(double amount) {
			double discountedAmount = applyDiscount(amount);
			System.out.println("\nPurchase price for loyal customer after discount for £" + amount +" is: £" + discountedAmount);
			super.addPurchaseHistory(discountedAmount);
			
		}		 
}