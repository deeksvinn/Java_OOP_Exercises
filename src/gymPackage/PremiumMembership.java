// Gym Mebership : This is sub class PremiumMembership which has attributes, personal trainer availability and spa access
// 

package gymPackage;

public class PremiumMembership extends GymMembership {
	
	String personalTrainerAvailability;
	String spaAccess;
	
	// Constructor

	public PremiumMembership(String memberName, String membershipType, int duration,String personalTrainerAvailability,String spaAccess) {
		
		super(memberName, membershipType, duration);
		
		this.personalTrainerAvailability = personalTrainerAvailability;
		this.spaAccess = spaAccess;
	}

	// Getters and setters for personaltraineravailability and spaAccess
	
	public String getPersonalTrainerAvailability() {
		return personalTrainerAvailability;
	}

	public void setPersonalTrainerAvailability(String personalTrainerAvailability) {
		this.personalTrainerAvailability = personalTrainerAvailability;
	}

	public String getSpaAccess() {
		return spaAccess;
	}

	public void setSpaAccess(String spaAccess) {
		this.spaAccess = spaAccess;
	}

	// Override method for special offers
	
	@Override
	public void specialOffers() {
		
		super.specialOffers();		
	}
	

	// Override method for calculating membership fees depending on the availability of personal trainer and spa access
		
	public double calculateMembershipFees(String personalTrainerAvailability,String spaAccess) {
		
		double extraCharges = 0.0;
		
		super.calculateMembershipFees();
		
		super.specialOffers();
		
		System.out.println("\nDiscount is available only for premium membership");
		
		// If the personal Trainer Availbilty ,which is taken as user input is "Yes", then extra charges is £25
		
		if (this.personalTrainerAvailability.equalsIgnoreCase("yes")) {
			
				extraCharges += 25;
		}
		
		// If spa access,which is taken as user input is "Yes", then extra charges is £20
		
		if(spaAccess.equalsIgnoreCase("yes")) {
			
			extraCharges += 20;			
		}
			
		membershipFees = membershipFees + extraCharges; 
		
		return membershipFees;
	}

	// Override method to display gym member details
	
	@Override
	public void displayMemberDetails() {
		
		super.displayMemberDetails();
		
		System.out.println("Final membership fees after extra charges : "  + calculateMembershipFees(getPersonalTrainerAvailability(),getSpaAccess()));
	}
}
