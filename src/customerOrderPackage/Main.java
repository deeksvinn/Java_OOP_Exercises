// 27. Write a Java program to create a class called "CustomerOrder" with attributes for order ID, customer, and order date. 
// Create a subclass "OnlineOrder" that adds attributes for delivery address and tracking number. 
// Implement methods to calculate delivery time based on the address and update the tracking status.

package customerOrderPackage;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		// Initializing customerOrder and creating two online orders both placed on same day with different address
		
		CustomerOrder order1 = new CustomerOrder(12345,"Captian America",LocalDate.parse("2024-08-09"));
		
		OnlineOrder onlineOrder1 = new OnlineOrder(9876,"Hulk", LocalDate.now(),"10,Road, London",100);
		
		OnlineOrder onlineOrder2 = new OnlineOrder(5643, "Black Widow", LocalDate.now(), "20,Road,Highlands",56);
		
		// Printing order details as soon as they are placed
		
		order1.displayOrderDetails();
		
		onlineOrder1.displayOrderDetails();
		
		onlineOrder2.displayOrderDetails();
		
		System.out.println("------------------------");
		
		// Calculating delivery time for online orders and update tracking status
		
		onlineOrder1.calculateDeliveryTime();
		onlineOrder1.updateTrackingStatus();
		
		onlineOrder2.calculateDeliveryTime();
		onlineOrder2.updateTrackingStatus();
		
		System.out.println("---------------------");
		
		onlineOrder1.displayOrderDetails();
		onlineOrder2.displayOrderDetails();
	}

}
