// 14. School.java: This is subclass for School.java which has details of students

package school;

public class Student {
	
	private String studentName;
	
	// Constructor
	
	public Student(String studentName) {
		
		this.studentName = studentName;
	}

	// Get and set methods for student name

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	// Override method to print student name in readable format
	@Override
	
    public String toString() {
        return (studentName);
    }
}

