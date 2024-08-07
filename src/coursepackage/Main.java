// 23. Write a Java program to create a class called "Course" with attributes for course name, instructor, and credits.
// Create a subclass "OnlineCourse" that adds attributes for platform and duration. Implement methods to display course 
// details and check if the course is eligible for a certificate based on duration.

// This is the Main class 

package coursepackage;

public class Main {

	public static void main(String[] args) {
		
		// Creating objects for Course and OnlineCourse 
		
		Course course1 = new Course("Learn Java", "Mr Smith",6);
		OnlineCourse onlineCourse1 = new OnlineCourse("Software Engineering", "Mrs Osmond", 5, "Big Button",12);
		
		// Displaying details of course and onlineCourse
		
		course1.displayCourseDetails();
		onlineCourse1.displayCourseDetails();
		
		// Checking the eligibility for certificate and printing the the message,else print not eligible
		
		if (onlineCourse1.eligibleForCertification()) {
			
			System.out.println("Eligible for Certificate");
			
		} else {
			
			System.out.println("Sorry! Not eligible for Certificate");			
		}		
	}
}
