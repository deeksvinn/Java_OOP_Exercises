// Customer: Customer class is a super class, where name,email, and purchase history are set
// and total expenditure is calculated

package customerpackage;
import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private String name;
	private String email;
	private List<Double> purchaseHistory;
	
	// Constructor
	
	public Customer(String name, String email) {
		
		this.name = name;
		this.email = email;
		this.purchaseHistory = new ArrayList<>();
	}
	
	// Getters and setters for name,email and purchase history

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Double> getPurchaseHistory() {
		return purchaseHistory;
	}

	public void setPurchaseHistory(List<Double> purchaseHistory) {
		this.purchaseHistory = purchaseHistory;
	}
	
	// Adding amount to the purchase history
	
	public void addPurchaseHistory(double amount) {
		purchaseHistory.add(amount);
	}
	
	// Calculating total expenditure
	
	public double calculateTotalExpenditure() {
		
		double totalExpenditure = 0.0;
		
		for (double amount : purchaseHistory) {
			totalExpenditure += amount;		
		}
		return totalExpenditure;
	}
}
