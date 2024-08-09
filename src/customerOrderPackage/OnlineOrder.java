// Customer Order: This is sub class OnlineOrder for super class Customer order which has additional attributes
// of delivery address,tracking number. It has methods to calculate delivery time and update tracking status.

package customerOrderPackage;

import java.time.LocalDate;

public class OnlineOrder extends CustomerOrder {
	
	public String deliveryAddress;
	public int trackingNumber;
	public int deliveryTime=0;
	public String trackingStatus = "Order placed";
	
	// Constructor
	
	public OnlineOrder(int orderId, String customerName, LocalDate orderDate,String deliveryAddress,int trackingNumber) {
		super(orderId, customerName, orderDate);
		this.deliveryAddress = deliveryAddress;
		this.trackingNumber = trackingNumber;
	}
	
	// Method to calculate delivery time based on the location of address.If address has London, 
	// then delivery is in 2 days else the delivery is in 4 days
	
	public void calculateDeliveryTime() {
		
		if (deliveryAddress.contains("London")) {
			
			deliveryTime += 2;
	
			System.out.println("Delivery time is " + deliveryTime);
			
		}else {
			
			deliveryTime += 4;
			
			System.out.println("Delivery time is " + deliveryTime);
		}	
	}	
	
	// Method to update tracking status depending on the delivery time
	
	public void updateTrackingStatus() {
		
		if (deliveryTime<=2) {
		
			trackingStatus = "Delivery in 2 days";
			
		}else { 
		
			trackingStatus = "Delivery in 4 days";			
		}		
	}
	
	// Override method to display order details for online orders
	
	public void displayOrderDetails() {
	
		super.displayOrderDetails();
		
		System.out.println("Delivery address : " + deliveryAddress);
		System.out.println("Tracking number : " + trackingNumber);
		System.out.println("Status for online order with order id " + orderId + " : " + trackingStatus);
	}	
}
