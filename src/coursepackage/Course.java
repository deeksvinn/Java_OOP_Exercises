// Course: This is class called "Course" which is asuper class with attributes for course name, instructor, 
// and credits. It has a method displayCourseDetails which is override in subclass OnlineCourse.

package coursepackage;

public class Course {
	public String courseName;
	public String instructor;
	public int credits;

	// Constructor for course name,instructor,credits
	
	public Course(String courseName, String instructor, int credits) {
	
		this.courseName = courseName;
		this.instructor = instructor;
		this.credits = credits;
	}
	
	// Getters and setters for course name,instrucor and credits

	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructorName(String instructor) {
		this.instructor = instructor;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	// Method to display course details
	
	public void displayCourseDetails() {
		
		System.out.println("Course Name: " + courseName);
		System.out.println("Instructor Name: " + instructor);
		System.out.println("Credits: " + credits);		
	}
}
