// 26. Write a Java program to create a class called "Event" with attributes for event name, date, and location.
// Create subclasses "Seminar" and "MusicalPerformance" that add specific attributes like number of speakers for
// seminars and performer list for concerts. Implement methods to display event details and check for conflicts 
// in the event schedule.

package eventPackage;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		// Creating a list for performers
		
		List<String> performers = new ArrayList<>();
		
		// Initializing seminar and musical performance
		
		Seminar seminar = new Seminar("Property Investment",LocalDate.parse("2024-10-08"), "London",4);
		MusicalPerformance musicalPerformance = new MusicalPerformance("Mamma Mia Musical",LocalDate.parse("2024-10-08"),"New York",6);
		
		// Adding performers to the list
		
		performers.add("Band Famous");
		performers.add("Band Beatles");
		
		// Displaying details of events and checking for conflict
		
		seminar.displayEventDetails();
		musicalPerformance.displayEventDetails();
		System.out.println("Performers : " + performers);
		seminar.checkForConflict(musicalPerformance);		
    }
}
