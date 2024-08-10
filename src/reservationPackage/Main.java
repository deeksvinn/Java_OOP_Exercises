// 28. Write a Java program to create a class called "Reservation" with attributes for reservation ID, customer name, and date.
// Create subclasses "ResortReservation" and "RailwayReservation" that add specific attributes like room number for hotels 
// and seat number for flights. Implement methods to check reservation status and modify reservation details.

package reservationPackage;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		// Initializing resortReservation and railwayReservation 
		
		ResortReservation resortReservation = new ResortReservation("A123", "Tony", LocalDate.parse("2024-12-08"),910);
		RailwayReservation railwayReservation = new RailwayReservation("PNR987", "Anna", LocalDate.parse("2024-10-10"),120);
		
		// Checking status of reservation
		
		resortReservation.checkReservationStatus();
		
		railwayReservation.checkReservationStatus();
		
		System.out.println("---------------------");
		
		// Modifying resort reservation and checking the status
		
		resortReservation.modifyReservation("Tony",LocalDate.parse("2024-12-08"), 405);
		
		resortReservation.checkReservationStatus();
		
		System.out.println("----------------------");
		
		// Modifying railway reservation with wrong customer name and checking status
		
		railwayReservation.modifyReservation("Bob", LocalDate.parse("2024-10-15"),456);
		
		railwayReservation.checkReservationStatus();
		
		System.out.println("-------------------------");
		
		// Modifying railway reservation and checking the status
		
		railwayReservation.modifyReservation("Anna", LocalDate.parse("2024-10-15"),456);
		
		railwayReservation.checkReservationStatus();			
	}

}
