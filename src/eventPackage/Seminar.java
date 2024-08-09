// Event: This is sub class Seminar for super class Event which has attribute of number of speakers.
// This class has a override method to display event details and a method checkForConlict to check
// conflict of date and place with musical performance

package eventPackage;

import java.time.LocalDate;

public class Seminar extends Event {
	
	public int numSpeakers;
	
	// Constructor
	
	public Seminar(String eventName, LocalDate date, String location,int numSpeakers) {
		super(eventName, date, location);
		this.numSpeakers = numSpeakers;
	}

	// Getters and setters for number of speakers
	
	public int getNumSpeakers() {
		return numSpeakers;
	}

	public void setNumSpeakers(int numSpeakers) {
		this.numSpeakers = numSpeakers;
	}

	// Override method to display event details
	
	@Override
	public void displayEventDetails() {

		System.out.println("Event type : Seminar");
		
		super.displayEventDetails();
		
		System.out.println("Number of speakers at event : " + numSpeakers);
	}
	
	// Method to check for conflict of date and location wth musical performance
	
	public void  checkForConflict(Event musicalPerformance) {
		
		if  (date.equals(musicalPerformance.date)) {
			
			if(location.equals(musicalPerformance.location)) {

				System.out.println("\nConflict -- Both events are scheduled at the same time and location.");
				
			} else {
				
			System.out.println("\nNo conflict --  Both events are scheduled at the same time at different locations.");	
			
			}	
		}
	}	
}	
	
	

