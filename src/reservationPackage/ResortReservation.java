// Reservation: This is sub class ResortReservation for super class Reservation which has attributes for room number
// and overrride methods for checking reservation status and modifying reservation

package reservationPackage;

import java.time.LocalDate;

public class ResortReservation extends Reservation {
	
	public int roomNumber;

	// Constructor
	
	public ResortReservation(String reservationId, String customerName, LocalDate date,int roomNumber) {
		
		super(reservationId, customerName, date);
		
		this.roomNumber = roomNumber;
	}

	// Getter and setter for room number
	
	public int getRoomNumber() {
		
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		
		this.roomNumber = roomNumber;
	}
	
	 // Override method to check reservation status and including room number
	
    @Override
    public void checkReservationStatus() {
    	
    	System.out.println("Resort reservation details:");
    	
        super.checkReservationStatus(); 
        
        System.out.println("Room Number: " + roomNumber);
        
        System.out.println("\n");
    }

    // Method to modify reservation details with room number
    
    public void modifyReservation(String newCustomerName, LocalDate newDate, int newRoomNumber) {
    	
        super.modifyReservation(newCustomerName, newDate); 
        
        this.roomNumber = newRoomNumber;
    }
}
