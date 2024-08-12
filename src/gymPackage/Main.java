// 30. Write a Java program to create a class called "GymMembership" with attributes for member name, membership type, and duration. 
// Create a subclass "PremiumMembership" that adds attributes for personal trainer availability and spa access. 
// Implement methods to calculate membership fees and check for special offers based on membership type.
// This main class takes user input of personal trainer availability and spa access

package gymPackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Scanner for user input of personalTrainerAvailability and spaAccess
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Is personal trainer available: Enter Yes or No");
		
		String personalTrainerAvailability = input.nextLine();
		
		System.out.println("Is Spa access available: Enter Yes or No");
		
		String spaAccess = input.nextLine();
	
		input.close();
		
		// Initializing gym membership 
		
		GymMembership gym = new GymMembership("Rock","General",12);
	
		gym.calculateMembershipFees();
		
		System.out.println("\n");
		
		// Initializing premium membership 
		
		PremiumMembership premium = new PremiumMembership("Mr Bean","Premium",6,personalTrainerAvailability,spaAccess);
		
		System.out.println("personal Trainer Availability for premium member : " + personalTrainerAvailability);
		
		System.out.println("Spa access Availability for premium member : " + spaAccess);
		
		// Checking if special offers are available for both general and premium members
		
		gym.specialOffers();
		
		premium.specialOffers();
	
		// Displaying membership details
		
		gym.displayMemberDetails();
		
		premium.displayMemberDetails();		
	}
}
