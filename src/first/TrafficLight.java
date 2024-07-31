// 8. Write a Java program to create class called "TrafficLight" with attributes for colour and duration, 
//and methods to change the colour and check for red or green. 

package first;

public class TrafficLight {
	
	  private String colour;
	  private int duration;
	 
	  // Constructor
	  
	  public TrafficLight(String colour, int duration) {
		  
	    this.colour = colour;
	    this.duration = duration;
	  }
	  
	  // Get and Set method for colour and duration
	  
	  public String getcolour() {
		return colour;
	  }

	  public void setcolour(String colour) {
			this.colour = colour;
	  }		
		
	  public int getDuration() {
		    return duration;
	  }
		  
	  public void setDuration(int duration) {
		    this.duration = duration;
	  }

		
	 // Method to change the colour of the traffic light

	  public void changecolour(String newcolour) {
	    colour = newcolour;
	  }

	  // Method to check if the traffic light is red. Returns true or false
	  
	  public boolean isRed() {
	    return colour.equals("red");
	  }

	  // Method to check if the traffic light is green. Returns true or false
	  
	  public boolean isGreen() {
	    return colour.equals("green");
	  }
	  
	  // Main method
	  
	  public static void main(String[] args) {
	
		  // colours to print in colour
		  
		final String RESET = "\033[0m"; 
		final String RED = "\033[0;31m";     
		final String GREEN = "\033[0;32m";   
		
	    TrafficLight light = new TrafficLight("red", 30);
	    System.out.println(RED + "The light is red: " + light.isRed() + RESET);
	    System.out.println("The light is green: " + light.isGreen());
	    
	    // Print the duration of the traffic light
	    
	    System.out.println("The light duration is: " + light.getDuration() + " seconds");

	    // Changing colour to green
	    
	    light.changecolour("green");
	    System.out.println(GREEN + "The light is green:" + light.isGreen()+ RESET);
	    light.setDuration(20);
	    
	    // Print the updated duration of the traffic light
	    System.out.println("The light duration is now: " + light.getDuration() + " seconds");
	  }
}


 