// 7. Write a Java program to create a class called "Bank" with a collection of accounts and methods 
// to add and remove accounts, and to deposit and withdraw money. 
// Also define a class called "Account" to maintain account details of a particular customer.

package bankAccounts;
import java.util.ArrayList;
import java.util.Arrays;

public class Bank {
	
	private ArrayList<Account> accounts;
	
	// Constructor
	
	public Bank() {
	
		accounts = new ArrayList<Account>();
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public void removeAccount(Account account) {
		accounts.remove(account);
	}
	
	// To display all accounts details from the array list accounts
	
	public static void displayAccounts(ArrayList<Account> accounts) {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
	
	// main method
	
	public static void main(String[] args) {
		
		// Creating objects for bank and accounts 
		
		Bank bank = new Bank();
		Account account1 = new Account("James Cameron" , 576536 , "12-23-21",50000.00);
		Account account2 = new Account("Andy Murray" , 453673, "16-38-13",60000.00);
		Account account3 = new Account("Celina Dion" , 768643, "76-34-56",80000.00);
	
		// Adding accounts to bank 
		
		bank.addAccount(account1);
		bank.addAccount(account2);
		
		// To display added accounts to the bank
		
		account1.displayAccountDetails();
		account2.displayAccountDetails();
		account3.displayAccountDetails();
		
		// To deposit into account1 and display account details after updating account balance
		
		account1.deposit(account1,5575);
		account1.displayAccountDetails();
		
		// To withdraw from account2 and display account details after updating account balance
		
		account2.withdraw(account2,700);
		account2.displayAccountDetails();

		// To remove account3 from the bank
		
		bank.removeAccount(account3);
		
		// To print all bank accounts after all updations
	}
}	
	
    
