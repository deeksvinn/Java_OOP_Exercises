// Reservation: This is sub class RailwayReservation for super class Reservation which has attributes for seat number
// and overrride methods for checking reservation status and modifying reservation

package reservationPackage;

import java.time.LocalDate;

public class RailwayReservation extends Reservation {
	
	public int seatNumber;

	// Constructor
	
	public RailwayReservation(String reservationId, String customerName, LocalDate date,int seatNumber) {
		
		super(reservationId, customerName, date);
		
		this.seatNumber = seatNumber;
	}

	// Getters and Setters for seat number
	
	public int getSeatNumber() {
		
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		
		this.seatNumber = seatNumber;
	}
	
	// Override method to check reservation status and including seat number
	
    @Override
    public void checkReservationStatus() {
    	
    	System.out.println("Railway reservation details:");
    	
        super.checkReservationStatus(); 
        
        System.out.println("Seat Number: " + seatNumber);
    }

    // Override method to modify reservation details to change date and seat number of reservation
    
    public void modifyReservation(String customerName, LocalDate newDate, int newSeatNumber) {
    	
        super.modifyReservation(customerName, newDate); 
        
        this.date = newDate;
        
        this.seatNumber = newSeatNumber;
    }
}
