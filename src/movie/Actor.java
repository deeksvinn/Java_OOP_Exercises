// 17. Movie.java : This is subclass Actor.java for Movie.java which has the details of actor

package movie;

public class Actor {
	
	private String actorName;

	// Constructor
	
	public Actor(String actorName) {
		
		this.actorName = actorName;
	}
	
	// Get and set methods for actor name 

	public String getActorName() {
		
		return actorName;
	}

	public void setActorName(String actorName) {
		
		this.actorName = actorName;
	}
	
	// To print actor names in readable format
	
	public String toString() {
		
        return (actorName);
    }	
}

