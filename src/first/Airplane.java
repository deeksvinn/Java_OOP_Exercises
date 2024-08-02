// 12. Write a Java program to create a class called "Airplane" with a flight number, 
// destination, and departure time attributes, and methods to check flight status and delay.

package first;
import java.time.LocalTime;
//import java.time.LocalDateTime;

public class Airplane {
	
	String flightNumber;
	String destination;
	private LocalTime departureTime;
	private int delayTime;

	// Constructor
	
	public Airplane(String flightNumber, String destination, LocalTime departureTime) {
		
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.departureTime = departureTime;
		this.delayTime = 0;
	}
	
	// Get and set methods for flight number,destination,departure time and delay time

	public String getFlightNumber() {
		return flightNumber;
	}
	
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public int getDelayTime() {
		return delayTime;
	}

	public void setDelayTime(int delayTime) {
		this.delayTime = delayTime;
	}

	// Method to delay the flight
	
	public void flightDelay(int delayMinutes) {
		
		this.delayTime = delayMinutes;
		this.departureTime = departureTime.plusMinutes(delayMinutes);
	}
	
	// Method to check the flight status
	
	public void flightStatus() {
		
	    if (delayTime == 0) {
	    	
	      System.out.println("Flight " + flightNumber + " is on time");
	    } 
	    
	    else {
	      
	      System.out.println("Flight " + flightNumber + " is delayed by " + delayTime + " minutes");
	    }
	  }

	// Main method
	
	public static void main(String[] args) {
		
		Airplane flight1 = new Airplane("VS001","San Fransisco",LocalTime.of(07,00));
		Airplane flight2 = new Airplane("BA235", "Sydney",LocalTime.of(20,30));
		
		System.out.println("Local time now is " + LocalTime.now());
		
		// Flight1 status		
		flight1.flightStatus();
		
		// Flight2 status		
		
		flight2.flightDelay(30);
		flight2.flightStatus();
	}
}
