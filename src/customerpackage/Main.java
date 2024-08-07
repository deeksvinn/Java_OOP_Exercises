// 22. Write a Java program to create a class called "Customer" with attributes for name, email, and purchase history. 
// Implement methods to add purchases to the history and calculate total expenditure. Create a subclass "LoyalCustomer"
// that adds a discount rate attribute and a method to apply the discount.

// This is main class which creates objects for customer and loyalcustomer classes

package customerpackage;

public class Main {

	public static void main(String[] args) {
		
		// Creating new customer and adding purchases of customer1 to the purchase history and printing their total expenditure
		
		Customer customer1 = new Customer("A Jolie","ajolie@gmail.com");
		
		customer1.addPurchaseHistory(5000);
        customer1.addPurchaseHistory(8000);
        
        System.out.println("Total expenditure for " + customer1.getName() + ": £" + customer1.calculateTotalExpenditure());

        // Creating loyal customer and adding purchases of loyalcustomer1 to the purchase history, applying discount and printing their total expenditure
        
        LoyalCustomer loyalCustomer1 = new LoyalCustomer("Rebecca Smith","rsmith@yahoo.com",20); 
        
        loyalCustomer1.addPurchaseHistory(10000);
        loyalCustomer1.addPurchaseHistory(1200);
        
        System.out.println("\nTotal expenditure for " + loyalCustomer1.getName() + " after discount: £" + loyalCustomer1.calculateTotalExpenditure());
    }
}
