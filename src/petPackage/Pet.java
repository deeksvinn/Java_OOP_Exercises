// Pet : This is the super class Pet which has attributes name,species and age of the pet.
// This class has methods to display pet details and calculate human age of the pet.

package petPackage;
import java.lang.Math;

public class Pet {
	
	public String name;
	public String species;
	public int age;
	
	// Constructor
	
	public Pet(String name, String species, int age) {
		super();
		this.name = name;
		this.species = species;
		this.age = age;
	}

	// Getters and setters for name,species and age
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// Super class method to display pet details
	
	public void displayPetDetails() {
	
		System.out.println("Name of the pet : "+ name);
		System.out.println("Species of the pet : " + species);
		System.out.println("Age of the pet : " + age);
	}
	
	// Method to calculate pet age
	
	public void calculatePetAge() {
		
		double humanAge;
		
		// Checking if the species is dog and using the formula to calculate dog's age 
		
		if (species.equals("Dog")){
			
			humanAge = 16 * Math.log(age) + 31;
			
			System.out.println("Human age of dog : " + humanAge);
			
		// If the species is other than dog, calculating the age with formula (age * human's average age/bird's average age)
		// assuming here human's average age is 72.6 and bird's average age is 8
			
		} else {
				
			humanAge = (age * 72.6) / 8;
			
			System.out.println("Human age of bird : " + humanAge);			
		}
	}
}
