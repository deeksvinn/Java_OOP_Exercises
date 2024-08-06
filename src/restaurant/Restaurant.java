// 18. Write a Java program to create a class called "Restaurant" with attributes for menu items,
// prices, and ratings, and methods to add and remove items, and to calculate average rating.

package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	
	public ArrayList menuItems;
	public ArrayList prices;
	List<Double> ratings = new ArrayList<>();
	
	// Constructor
	
	public Restaurant() {
		
		menuItems = new ArrayList<> ();
		prices = new ArrayList<> ();
		ratings = new ArrayList<> ();
	}
	
	// Method to add item to the restaurant
	
	public void addItem(String item,double price) {
		
		menuItems.add(item);
		prices.add(price);
	}
	
	// Method to remove item from the restaurant menu and its corresponding price
	
	public void removeItem(String item) {
		
		int index = menuItems.indexOf(item);
		
		if (menuItems.contains(item)) {
			
			menuItems.remove(item);
			
			prices.remove(index);
		}
	}
	
	// Method to add rating of the restaurant to ratings arraylist
	
	public void rating(double rating) {
		
		ratings.add(rating);
		 
	}
	
	// To display the item and its price by iterating over the menuItems arraylist
	
	public void displayMenu() {
		
		System.out.println("\nMENU:");
		System.out.println("-----");
		
		for (int i = 0; i < menuItems.size(); i++) {
			
		    System.out.println(menuItems.get(i) + ": £" + prices.get(i));
		}
	}
	
	// Main method
	
	public static void main(String[] args) {
		
		double sum = 0.0;
		double average = 0.0;
		
		Restaurant restaurant = new Restaurant();
		
		// Adding menu items to the restaurant
		
		restaurant.addItem("Coke", 2.5);
		restaurant.addItem("Nuggets", 4.0);
		restaurant.addItem("Fries", 3.5);
		restaurant.addItem("Wrap", 6.0);
		restaurant.addItem("Salad", 3.0);
		restaurant.addItem("Pasta", 8.0);
		
		// To display the item and its price
		
		restaurant.displayMenu();
		
		// Setting the restaurant ratings 
		
		restaurant.rating(5);
		restaurant.rating(3);
		restaurant.rating(4);
		restaurant.rating(2);
		
		System.out.println("\nThe ratings given by the customers to the restaurant :" + restaurant.ratings);
		
		// To print the average rating of the restaurant by iterating over the ratings arraylist
		
        for (int j = 0; j < restaurant.ratings.size(); j++) {
            sum += restaurant.ratings.get(j);
            average = sum / restaurant.ratings.size();
        }   
       
        System.out.println("\nThe average rating of the restaurant is " + average);	
        
        restaurant.removeItem("Salad");
        
     // To display the item and its price after removing one menu item
		
     	restaurant.displayMenu();
	}	
}


