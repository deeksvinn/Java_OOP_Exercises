// 19. Write a Java program to create a class with methods to search for flights and hotels, and to book and cancel reservations.

// This is subclass AirTravel.java which has flights and hotels in arrayLists an methods to search,book and cancel flights and hotels.

package travel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class AirTravel {
	
	private ArrayList<Flight> flights;
	private ArrayList<Hotel> hotels;
	
	// Constructor
	
	public AirTravel() {
		this.flights = new ArrayList<> ();
		this.hotels = new ArrayList<> ();
		
	}

	// Method to search for a flight with origin,destination,number of passengers and date of travel details
	
	public void searchFlights(String origin, String destination, int numberOfPassengers, LocalDate dateOfTravel) {
		
		System.out.println("\nSearching for flights from " + origin + " to " + destination + " on " + dateOfTravel + " for " + numberOfPassengers + " passengers");
	}
	
	// Method to search for a hotel with location of hotel,date of checkin, date of checkout and number of guests
	
	public void searchHotels(String locationOfHotel, LocalDate dateOfCheckin, LocalDate dateOfCheckout, int numberOfGuests) {
		
		System.out.println("\nSearching for hotels in " + locationOfHotel + " from " + dateOfCheckin + " to " + dateOfCheckout + " for " + numberOfGuests + " guests");
	}
	
	// Method to generate a random booking reference
	
	private int generateBookingReference() {
		
		Random rand = new Random();	
		
		return rand.nextInt(90000) + 10000;
	}
	
	// Method to book a flight by taking flight number,passenger name,origin,destination,date of travel,number of passengers and the price
	
	public void bookFlight(String flightNumber, String passengerName, String origin, String destination,LocalDate dateOfTravel, int numberOfPassengers, double price) {
		
		Flight flight = new Flight(flightNumber, passengerName, origin, destination, dateOfTravel, numberOfPassengers, price);
	  
		// Generating a booking reference for flight booking
		
	    int bookingReference = generateBookingReference();
	    
	    // Setting the booking reference to the flight and adding flight to the arrayList flights and printing the bookingn reference
	    
	    flight.setBookingReference(bookingReference);
	    
	    flights.add(flight);   
	    
	    System.out.println("\n" + passengerName + " Congratulations. Your flight is booked. Booking reference: " + bookingReference);
	 }
		
	// Method to book a hotel by taking hotel name,guest name,location of hotel,date of checkin and checkout and price
	
	 public void bookHotel(String hotelName, String guestName, String locationOfHotel, LocalDate dateOfCheckin, LocalDate dateOfCheckout,int numberOfGuests, double price) {
	    
	    Hotel hotel = new Hotel(hotelName, guestName, locationOfHotel, dateOfCheckin, dateOfCheckout,numberOfGuests,price);
	    
	    // Generating a booking reference for hotel booking
	    
	    int bookingReference = generateBookingReference();
	    
	    // Setting the booking reference to the hotel and adding hotel to the arrayList hotels and printing the booking reference
	    
	    hotel.setBookingReference(bookingReference);
	    
	    hotels.add(hotel);
	    
	    System.out.println("\n" + guestName + " your hotel is booked. Booking reference : " + bookingReference);
	 }

	  // Method to cancel a reservation for flight and hotel and print the details
	 
	  public void cancelReservation(int bookingReference) {		  
		  
		// For flight reservation cancellation
		  
		  for (Flight flight : flights) {
	    	
	    	// If the confirmation number matches, remove the flight reservation
	    	
	    	if (flight.getBookingReference() == bookingReference) {
	    	  
	    	flights.remove(flight);
	    	
	        System.out.println("\nFlight reservation with booking reference " + bookingReference + "is cancelled");
	     
	    	}
		  }	
	    
	    // For hotel reservation cancellation
	    
		  for (Hotel hotel : hotels) {
	    	
	    	// If the confirmation number matches, remove the hotel reservation
	    	
	    	if (hotel.getBookingReference() == bookingReference) {
	    	  
	        hotels.remove(hotel);
	        
	        System.out.println("\nHotel reservation with booking reference " + bookingReference + " cancelled");
	      
	    	}
		  }
	    
	    // Print a message if no reservation is found with the provided confirmation number
	    
	    System.out.println("\nThere are no reservations with booking reference " + bookingReference);
	  }
}
