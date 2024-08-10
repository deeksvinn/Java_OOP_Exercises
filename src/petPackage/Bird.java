// // Pet : This is subclass Dog for super class Pet which has attribute wing span for bird.
// This class has override method for displaying pet details.

package petPackage;

public class Bird extends Pet{

	public double wingSpan;

	public Bird(String name, String species, int age,double wingSpan) {
		super(name, species, age);
		this.wingSpan = wingSpan;
	}

	@Override
	public void displayPetDetails() {
		System.out.println("\nBird details");
		System.out.println("-------------");
		super.displayPetDetails();
		System.out.println("Wing span of the bird : " + wingSpan + "cm");
	}
}
