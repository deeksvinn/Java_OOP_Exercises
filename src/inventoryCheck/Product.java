// 13. This is subclass Product for Inventory class. This class has product details

package inventoryCheck;

public class Product {
	
	private String productName;
	private int stockLevel;

	// Constructor
	
	public Product(String productName, int stockLevel) {

		this.productName = productName;
		this.stockLevel = stockLevel;
	}

	// Get and Set methods for product name and stock level
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getStockLevel() {
		return stockLevel;
	}

	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}
	
	// To print product details in readable format.
	
	public String toString() {
        return ("\nProduct name: " + productName + " \tStock level: " + stockLevel);
    }	
}
