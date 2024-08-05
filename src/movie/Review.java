// 17.Movie.java: This is subclass Review for Movie.java which has review details

package movie;

public class Review {
	
	private String review;

	// Constructor
	
	public Review(String review) {
		
		this.review = review;
	}
	
	// Get and set methods for review
	
	public String getReview() {
		
		return review;
	}

	public void setReview(String review) {
		
		this.review = review;
	}

	// To print review in readable format
	
	public String toString() {
		
        return (review);
    }
}
