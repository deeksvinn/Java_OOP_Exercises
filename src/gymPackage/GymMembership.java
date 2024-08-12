// Gym Membership : This is super class GymMembership which has attributes member name,membership type,duration and membership fees.
// This class has super class methods to calculate membership fees, special offers and display member details

package gymPackage;

public class GymMembership {
	
	public String memberName;
	public String membershipType;
	public int duration;
	public double membershipFees;
	
	// Constructor
	
	public GymMembership(String memberName, String membershipType, int duration) {
		
		super();
		
		this.memberName = memberName;
		
		this.membershipType = membershipType;
		
		this.duration = duration;
	}
	
	// Getters and setters for member name,membership type and duration of membership
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String getMembershipType() {
		return membershipType;
	}
	
	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	// Super class method to calculate membership fees with starting membership fee of £50

	public double calculateMembershipFees() {
		
			membershipFees = 50;
			return membershipFees;
		
	}
	
	// Super class method to calculate special offers available to the gym members. 
	// If the membership type is "Premium" , they will get a discount of £20
	
	public void specialOffers() {
		
		if (membershipType.equalsIgnoreCase("Premium")) {
			
			membershipFees = calculateMembershipFees() - 20 ;
			
		} else {
			
			System.out.println("\nNo discount available for General membership");			
		}
	}
	
	// Super class method to display gym member details
			
	public void displayMemberDetails() {
		
		System.out.println("\n");
		System.out.println("Member name: " + memberName);
		System.out.println("Membership type : " + membershipType);
		System.out.println("Duration of membership: "+ duration);	
		System.out.println("Membership fees: " + membershipFees);
	}		
}

