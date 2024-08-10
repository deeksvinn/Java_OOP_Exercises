// Reservation: This is super class Reservation which has attributes reservationId,customerName,date and status.
// This class has super class methods for checking reservation status and modifying reservation details

package reservationPackage;

import java.time.LocalDate;

public class Reservation {

	public String reservationId;
	public String customerName;
	public LocalDate date;
	public String status = "Reserved";
	
	// Constructor
	
	public Reservation(String reservationId, String customerName, LocalDate date) {
		
		super();
		this.reservationId = reservationId;
		this.customerName = customerName;
		this.date = date;
		this.status = "Reserved";
	}

	// Getters and setters for reservationid,customerName and date
	
	public String getReservationId() {
		
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		
		this.reservationId = reservationId;
	}

	public String getCustomerName() {
		
		return customerName;
	}

	public void setCustomerName(String customerName) {
		
		this.customerName = customerName;
	}

	public LocalDate getDate() {
		
		return date;
	}

	public void setDate(LocalDate date) {
		
		this.date = date;
	}
	
	// Super class method to check reservation status
	
	public void checkReservationStatus() {
		
		System.out.println("Reservation ID: " + reservationId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Date reservation is made for : " + date);
        System.out.println("Status: " + status);
       
    }

    // Super class method to modify reservation details 
	
    public void modifyReservation(String newCustomerName, LocalDate newDate) {
    	
        this.customerName = customerName;
        
    	if(this.customerName.equals(newCustomerName)) {
    		
  
        this.date = newDate;
        
        this.status = "modified";
        
        System.out.println("Status of reservation : " +  status);
        
    	} else {
    		
    		System.out.println("There is no booking for the customer " + newCustomerName);
    		System.out.println("\nThe reservations available are as follows");
    		System.out.println("\n");
    	}
    		
    }
}
	


