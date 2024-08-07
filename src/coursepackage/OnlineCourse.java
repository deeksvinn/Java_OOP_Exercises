// Course: This is sub class OnlineCourse for the super class Course which has attributes platform and duration.
// It has a method to check if eligible for certification and overrides a displayCourseDetails method from super class.

package coursepackage;

public class OnlineCourse extends Course {
	
	public String platform;
	public int duration;
	
	// Contructor for attributes from super class and platform and duration
	
	public OnlineCourse(String courseName, String instructor, int credits,String platform,int duration) {
		super(courseName, instructor, credits);
		this.platform = platform;
		this.duration = duration;
	}
	
	// Getters and setters for platform and duration
	
	public String getPlatform() {
		return platform;
	}
	
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	// Method to check eligibility for certification if course is greater than 12 weeks
	
	public boolean eligibleForCertification() {

		return duration >= 12;
	}
	
	// Override method for displayCourseDetails in Course class
	
	public void displayCourseDetails() {
		
		super.displayCourseDetails();
		System.out.println("Platform Name: " + platform);
		System.out.println("Duration of the course: " + duration);			
	}
}
