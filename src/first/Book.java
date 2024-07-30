// 5. Write a Java program to create a class called "Book" with attributes
//for title, author, and ISBN, and methods to add and remove books from a collection.

package first;
import java.util.ArrayList;

public class Book {
	
	public String bookTitle;
	public String bookAuthor;
	public int ISBN;
	public static ArrayList<Book> bookCollection;

	public Book(String bookTitle, String bookAuthor, int ISBN) {
	
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.ISBN = ISBN;
		this.bookCollection = new ArrayList<Book>();
	}

	// Get and set methods for book title, author and ISBN number
	
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}
	
	// Get method for BookCollection arrayList
	
	public static ArrayList<Book> get_BookCollection() {
     return bookCollection;
 }
	
	public static ArrayList<Book> set_BookCollection() {
     return bookCollection;
 }
	
	// Method to add a book to the bookCollection
	
	public static void addBook(Book book) {
		bookCollection.add(book);
	}
	
	// Method to remove a book to the bookCollection
	
	public static void removeBook(Book book) {
		bookCollection.remove(book);
	}
	
	// Main method
	
	public static void main(String[] args) {
		Book book1= new Book("Once Upon a Legend","Ben Miller",12345);
		Book book2 = new Book("Space Knights and Ice Dragons", "Sheryl Webster", 565767);
		Book book3 = new Book("Shipwreck Island","Struan Murray",54342);
		 
		// Adding books to the bookCollection
		
     Book.addBook(book1);
     Book.addBook(book2);
     Book.addBook(book3);
     
     // To print the title, author, and ISBN of each book
     
     System.out.println("Collection of books:");
     for (Book book : bookCollection) {
     	
         System.out.println("Book Name: " + book.getBookTitle() + "\nBook Author: " + book.getBookAuthor() + "\nISBN: " + book.getISBN() +"\n");
     }
     
     // Removing book from the bookCollection
     
     Book.removeBook(book3);
     System.out.println("\nAfter removing the book " + book3.getBookTitle() + ":");
     
     // To print the books collection after removing a book
     
     System.out.println("List of books:");
     for (Book book : bookCollection) {
     	System.out.println("Book Name: " + book.getBookTitle() + "\nBook Author: " + book.getBookAuthor() + "\nISBN: " + book.getISBN() +"\n");
     }
 }
}
