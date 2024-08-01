// 11. Write a Java program to create a class called "Library" 
// with a collection of books and methods to add and remove books.

package library;

import java.util.ArrayList;

public class Library {
	
	private ArrayList <Book> books;
	
	// Constructor
	
	public Library() {
		
		books = new ArrayList<Book>();
	}
	
	// Method to get books from the books arrayList
	
	public  ArrayList<Book> getBooks() {
		return books;
	}
	
	// Method to add books to the books arrayList
	
	public void addBook(Book book) {
		books.add(book);	
	}
	
	// Method to remove book from the arrayList
	
	public void removeBook(Book book) {
		books.remove(book);
	}
	
	// Method to display books in the library
	
	public void displayBooks() {
		
		System.out.println("Library:\n");
		for(Book book: getBooks()) {
			System.out.println("Book Title: " + book.bookTitle + "\tBook Author:" + book.bookAuthor);		
		}		
	}
	
	// Main method
	
	public static void main(String[] args) {
		
		// Books list
		
		Library library = new Library();
		Book book1 = new Book("Artemis Fowl","Eoin Colfer");
		Book book2 = new Book("Dog Man","Dav Pilkey");
		Book book3 = new Book("Robodog","David Walliams");
		
		// Adding books to the library
		library.addBook(book1);;
		library.addBook(book2);
		library.addBook(book3);
		
		// To display books available in the library
		library.displayBooks();
		
		// To remove book and display the list of books from library
		library.removeBook(book1);	
		System.out.println("\nAfter removing a book:");
		library.displayBooks();
	}
}
	



