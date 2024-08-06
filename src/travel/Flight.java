// This is subclass Flight.java for Airtravel class which has details about flights

package travel;

import java.time.LocalDate;

public class Flight {
	
	private String origin;
	private String destination;
	private String passengerName;
	private int numberOfPassengers;
	private LocalDate dateOfTravel;
	private double priceOfTicket;
	private String flightNumber;
	private int bookingReference;
	

	// Constructor

	public Flight(String flightNumber, String passengerName, String origin, String destination,LocalDate dateOfTravel, int numberOfPassengers, double priceOfTicket) {

		this.origin = origin;
		this.destination = destination;
		this.passengerName = passengerName;
		this.numberOfPassengers = numberOfPassengers;
		this.dateOfTravel = dateOfTravel;
		this.flightNumber = flightNumber;
		this.priceOfTicket = priceOfTicket;
		this.bookingReference = bookingReference;
		
	}

	// Getters and setters origin,destintion,number of passengers,date of travel,flight number,price of ticket,booking reference,passenger name
	
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}	

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public LocalDate getDateOfTravel() {
		return dateOfTravel;
	}

	public void setDateOfTravel(LocalDate dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}

	public double getpriceOfTicket() {
		return priceOfTicket;
	}

	public void setpriceOfTicket(double priceOfTicket) {
		this.priceOfTicket = priceOfTicket;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public int getBookingReference() {
		return bookingReference;
	}

	public void setBookingReference(int bookingReference) {
		this.bookingReference = bookingReference;
	}	
}
