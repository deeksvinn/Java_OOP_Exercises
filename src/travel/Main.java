// 19. Write a Java program to create a class with methods to search for flights and hotels, and to book and cancel reservations. 
// Main.java class for booking flights and hotels

package travel;
import java.time.LocalDate;
 
public class Main {

	public static void main(String[] args) {
		
		AirTravel travel = new AirTravel();
		
		// Searching for flights
		travel.searchFlights("London", "San Fransisco",2,LocalDate.of(2022, 9, 1));
		
	    // Searching for hotels 
	    travel.searchHotels("London", LocalDate.of(2024,10,1),LocalDate.of(2024,10,10), 2);
	    
	    // Booking flights
	    travel.bookFlight("BA1234", "Ana Hathway", "Paris", "Toronto", LocalDate.of(2025, 01,05), 1, 1200.00);
	    travel.bookFlight("VS200", "Adam Goodway", "London","New York", LocalDate.of(2024, 10,05), 1, 800.00);
	    
	    // Booking a hotel 
	    travel.bookHotel("Grand Hotel", "James Rowan", "London",LocalDate.of(2025, 01,05),LocalDate.of(2025, 01,10),2, 255.00);
	    
	    // Cancel the reservation 
	    travel.cancelReservation(12345);

	}
}
