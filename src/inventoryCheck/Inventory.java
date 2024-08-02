// 13. Write a Java program to create a class called "Inventory" with a collection of
// products and methods to add and remove products, and to check for low inventory. 

package inventoryCheck;

import java.util.ArrayList;

public class Inventory {
	
	private ArrayList<Product> products;
	
	// Constructor
	
	public Inventory() {
		
		products = new ArrayList<>();
	}
	
	// Get and set methods for products arrayList
	
	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
	// Method to add a product

	public void addProduct(Product product) {
		
		products.add(product);
	}
	
	// Method to remove a product
	
	public void removeProduct(Product product) {
		
		products.remove(product);
	}
	
	// Method to check inventory
	
	public void checkInventory() {
		
		for (Product product : products) {
			if (product.getStockLevel() <= 25) {
				System.out.println(product.getProductName() + " is low in stock. Restock it");			
			}
		}
	}

	// To display product details from inventory
	
	public void displayInventory() {
		for (Product product : products) {
			System.out.println(product);
		}
	}	
	
	// Main method
	
	public static void main(String[] args) {
		
		
		Inventory inventory = new Inventory();
		Product product1 = new Product("Dyson fan heater",50);
		Product product2 = new Product("Dyson V10 vacuum",100);
		Product product3 = new Product("Dyson hair dryer",25);
		
		// Adding products to inventory
		inventory.addProduct(product1);
		inventory.addProduct(product2);
		inventory.addProduct(product3);
	
		// To display inventory
		inventory.displayInventory();
		
		System.out.println("\n");
		
		// To check inventory
		inventory.checkInventory();	
		
		// To remove product from inventory
		inventory.removeProduct(product1);
	
		// To display inventory
		System.out.println("\n Stock details after removing a product:");
		inventory.displayInventory();
		
		
		
	}

}
