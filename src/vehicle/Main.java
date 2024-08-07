// Vehicle: This is the main class for Vehicle program which initialises the objects for car and truck and displays their details

package vehicle;

public class Main {

	public static void main(String[] args) {
	
		Car car1 = new Car("Audi","Q5",2023,47.23);
		Truck truck1 = new Truck("Volvo","GT9500",2021,10);
		
		car1.displayDetails();
		truck1.displayDetails();
	}

}
