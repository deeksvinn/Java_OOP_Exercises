// Event: This is super class Event for sub classes Seminar and MusicalPerformance. 
// This class has attributes event name,date and location.
// This class has a method to display event details which are override in the sub classes.

package eventPackage;

import java.time.LocalDate;

public class Event {
	
	 public String eventName;
	 public LocalDate date;
	 public String location;

	 // Constructor
	 
	public Event(String eventName, LocalDate date, String location) {
		
		this.eventName = eventName;
		this.date = date;
		this.location = location;
	}
	
	// Getter and setter methods for event name,date and location

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	// Super class method to display event details

	public void displayEventDetails() {
		
		System.out.println("Event Name: " + eventName);
		System.out.println("Date of event : " + date);
		System.out.println("Location of event : " + location);
	}
}
