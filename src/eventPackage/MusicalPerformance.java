// Event: This is sub class MusicalPerformance for super class Event which has attribute of number of performers.
// This class has a override method to display event details

package eventPackage;

import java.time.LocalDate;

public class MusicalPerformance extends Event {

	public int numPerformers;

	public MusicalPerformance(String eventName, LocalDate date,String location,int numPerformers) {
		
		super(eventName, date, location);
		
		this.numPerformers = numPerformers;

	}

	public int getNumPerformers() {
		return numPerformers;
	}

	public void setNumSpeakers(int numSpeakers) {
		this.numPerformers = numPerformers;
	}
	
	// Override method to display event details
	
	@Override
	public void displayEventDetails() {
		System.out.println("\nEvent type : Musical Performance");
		super.displayEventDetails();
		System.out.println("Number of performers at the event : " + numPerformers);	
	}
}
