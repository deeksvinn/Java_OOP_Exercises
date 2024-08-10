// Pet : This is subclass Dog for super class Pet which has attribute favorite toy for a dog.
// This class has override method for displaying pet details.

package petPackage;

public class Dog extends Pet {
	
	public String favToy;

	// Constructor
	
	public Dog(String name, String species, int age,String favToy) {
		
		super(name, species, age);
		
		this.favToy = favToy;
		
	}

	// Override method to display pet details
	
	@Override
	public void displayPetDetails() {
		System.out.println("Dog details");
		
		System.out.println("-------------");
		
		super.displayPetDetails();
		
		System.out.println("Favourite toy : " + favToy);
	}
		
	
	

}
