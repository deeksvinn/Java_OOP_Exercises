// Vehicle: This is subclass Truck for Vehicle which has an added attribute of payloadCapacity for truck and 
// overrides the method displaydetails to display truck details.

package vehicle;

public class Truck extends Vehicle {
		
		public double payloadCapacity;

		// constructor for truck
		
		public Truck(String make, String model, int year,double payloadCapacity) {
			
			super(make, model, year);
			this.payloadCapacity = payloadCapacity;
		}
		
		// Getter and setter for payloadCapacity
		
		public double getPayloadCapacity() {
			return payloadCapacity;
		}

		public void setPayloadCapacity(double payloadCapacity) {
			this.payloadCapacity = payloadCapacity;
		}

		// Override method displayDetails from Vehicle class to display details about the truck
		
		@Override
		
		public void displayDetails() {
			
			super.displayDetails();
			System.out.println("Payload capacity of the truck :" + payloadCapacity +  " tonnes");
		}
}
