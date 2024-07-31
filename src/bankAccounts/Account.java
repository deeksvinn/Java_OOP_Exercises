// Account class for Bank.java 
// This class has account details of individual account holder 
package bankAccounts;

import java.util.Arrays;

public class Account {
	
	String accountName;
	int accountNumber;
	String sortCode;
	double accountBalance;
	
	// Constructor
	
	public Account(String accountName, int accountNumber, String sortCode, double accountBalance) {
	
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.sortCode = sortCode;
		this.accountBalance = accountBalance;
	}

	// Get and Set methods for account name,Account number,sort code and account balance
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void deposit(Account account,double depositAmount) {
		account.accountBalance = account.accountBalance + depositAmount;
	}
	
	public void withdraw(Account account,double withdrawAmount) {
		account.accountBalance = account.accountBalance - withdrawAmount;
	}
	
	public void displayAccountDetails() {
	System.out.println("Account name:" + accountName + "\tAccount number:" + accountNumber + "\tSort Code:" + sortCode + "\tAccount Balance:"+ accountBalance);
	}
	
	public String toString() {
        return ("\nAccount name: " + accountName + " \nAccount Number: " + accountNumber + "\nSort code:" +sortCode
        		+ "\nAccount Balance:"+ accountBalance);
     		
    }
	
}
