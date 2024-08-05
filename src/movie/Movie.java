// 17. Write a Java program to create a class called "Movie" with attributes for title, 
// director, actors, and reviews, and methods for adding and retrieving reviews.

package movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movie {
	
	private String movieTitle;
	private String movieDirector;
	private ArrayList<Actor> actors;

	// Constructor

	public Movie(String movieTitle, String movieDirector) { 
		
		this.movieTitle = movieTitle;
		this.movieDirector = movieDirector;
		actors =  new ArrayList<>();
	
	}
	
	// Method to add actor name
	
	public void addActor(Actor actorName)
	{
		actors.add(actorName);
	}
	
	// Main method
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        List<String> reviews = new ArrayList<>();
                
        // Movie name, director name and actors of the movie
        
        Movie movie = new Movie("Godzilla X Kong The new empire", "Adam Wingard");
		Actor actor1 = new Actor("Kaylee Hottle");
		Actor actor2 = new Actor("Rebecca Hall");
		Actor actor3 = new Actor("Dan Stevens");
		Actor actor4 = new Actor("Fala Chen");
		
		// Adding actors of the movie to an arrayList
		
		movie.addActor(actor1);
		movie.addActor(actor2);
		movie.addActor(actor3);
		movie.addActor(actor4);
		
		//Displaying movie title and director name
		
		System.out.println("The movie title: " + movie.movieTitle);
		System.out.println("The movie director: " + movie.movieDirector);
		
		// Displaying actors names in the movie
		
		System.out.println("The Actors in the movie :");
		System.out.println(movie.actors);
		System.out.println("\n");
		
		// Three reviews of the movie
		
		Review review1 = new Review("Excellent movie");
		Review review2 = new Review("Too good graphics");
		Review review3 = new Review("Amazing movie");
		
		// Input user's movie review
		
		System.out.println("Enter your review:");
		String review4 = scanner.nextLine();

		// Adding all four reviews to the reviews list
		
		reviews.add("\nMovie Review: " +  1 + "\n" + review1);
		reviews.add("\nMovie Review: " + 2 + "\n" + review2);
		reviews.add("\nMovie Review: " + 3 + "\n" + review3);
        reviews.add("\nMovie Review: " + 4 + "\n" + review4);

        // Displaying all movie reviews
        
        System.out.println("\nAll Movie Reviews");
        System.out.println("---------------------");
        
        for (String review : reviews) {
            System.out.println(review);
        }
        
        // Retrieving a specific review
        
        System.out.println("\nEnter the review number you want to retrieve (1 to 4):");
        
        int reviewNumber = scanner.nextInt();

        // Checking if review number is within the number of reviews written
        
        if (reviewNumber > 0 && reviewNumber <= 4) {
        	
            System.out.println("\nRetrieved Review :");
            System.out.println("---------------------");
            System.out.println(reviews.get(reviewNumber - 1));
            
        } else {
        	
            System.out.println("Invalid review number.");
        }
    }
}
