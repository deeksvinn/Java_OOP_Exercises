// 29. Write a Java program to create a class called "Pet" with attributes for name, species, and age.
// Create subclasses "Dog" and "Bird" that add specific attributes like favorite toy for dogs and wing span for birds.
// Implement methods to display pet details and calculate the pet's age in human years.

package petPackage;

public class Main {

	public static void main(String[] args) {
		
		// Initializing dog and bird
		
		Dog dog1 = new Dog("Bailey","Dog",2,"Ball");
		
		Bird bird1 = new Bird("Tutu", "bird",4,5);
		
		// Displaying dog and bird details and calculating their human age
		dog1.displayPetDetails();
		
		dog1.calculatePetAge();
		
		bird1.displayPetDetails();
		
		bird1.calculatePetAge();
	}
}
