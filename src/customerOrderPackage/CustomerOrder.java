// Customer Order: This is super class CustomerOrder which has attributes order id,customer name,order date
// This class has method displayOrderDetails which is override in sub class OnlineOrder

package customerOrderPackage;

import java.time.LocalDate;

public class CustomerOrder {

	public int orderId;
	public String customerName;
	public LocalDate orderDate;
	
	// Constructor
	
	public CustomerOrder(int orderId, String customerName, LocalDate orderDate) {
	
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderDate = orderDate;
	}
	
	// Method to dosplay order details
	
	public void displayOrderDetails() {
		
		System.out.println("\nOrder details are as follows");
		System.out.println("Order id: " + orderId);
		System.out.println("Customer name : " + customerName);
		System.out.println("Order date : " + orderDate)	;						
	}
}
