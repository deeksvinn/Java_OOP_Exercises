package first;

public class Dog {

	String dogName;
	String dogBreed;
	
	// Constructor
	
	public Dog(String dogName, String dogBreed) {
		
		this.dogName = dogName;
		this.dogBreed = dogBreed;
		
	}
	
	// Get methods for dog name and dog breed
	
	public String getDogName() {
		
		return dogName;
	}
	
	public String getDogBreed() {
		
		return dogBreed;
	}	
	
	// Set methods for dog name and dog breed

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}
	
	// Main method
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Bailey", "Poodle");
		Dog dog2 = new Dog("Zoey", "Golden Retriever");
		
		System.out.println("First Dog name :" + dog1.dogName + " \nBreed :" +dog1.dogBreed);
		System.out.println("Second Dog name :" + dog2.dogName + " \nBreed :" +dog2.dogBreed);
		
		dog1.setDogBreed("Terrier");
		dog2.setDogName("Kikki");
		System.out.println("\n");
		
		System.out.println("Dogs details after their breeds and names are changed:");
		System.out.println("First Dog name :" + dog1.dogName + "\nBreed :" +dog1.dogBreed);
		System.out.println("First Dog name :" + dog2.dogName + " \nBreed :" +dog2.dogBreed);

	}

}
