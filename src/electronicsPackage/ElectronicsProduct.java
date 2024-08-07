// ElectronicsProduct: This is superclass which has attributes for product and super class
// methods for apply discount calculating final product price and display product details

package electronicsPackage;

public class ElectronicsProduct {
		
		public String productId;
		public String productName;
		public double productPrice;
		public double discount;
		
		// Constructor for productId, productname,productprice
		
		public ElectronicsProduct(String productId, String productName, double productPrice) {
		
			this.productId = productId;
			this.productName = productName;
			this.productPrice = productPrice;
			
		}

		// Getter and setter methods for product id,product name and price
		
		public String getProductId() {
			return productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public double getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(double price) {
			this.productPrice = price;
		}
		
		// Super class method for applyDiscount which calculates the amount of discount to be applied on the product price
		
		public void applyDiscount(double discount) {
			
			double discountAmount = productPrice * (discount / 100);
			
			productPrice -= discountAmount;			
		}
		
		// Super class method to get final product price
		
		public double finalProductPrice() {
			
			return productPrice;
		}

		// Super class method to display product details
		
		public void displayProductDetails() {
			
			System.out.println("\nProduct ID: " + productId);
			System.out.println("Product Name: " + productName);
			System.out.println("Product Price: " + productPrice);		
		}
}
