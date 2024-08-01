// 11.Library program: This is sub class Book for Library class which will have details of the book

package library;

public class Book {
	
	String bookTitle;
	String bookAuthor;
	
	// Constructor
	
	public Book(String bookTitle, String bookAuthor) {
		
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	}

	// Get and set method for book title and book author
	
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
}

