// !4. School.java: This is subclass for school.java which has teacher details

package school;

public class Teacher {

	private String teacherName;
	
	// Constructor
	
	public Teacher(String teacherName) {
		this.teacherName = teacherName;
	}

	// Get and set methods for teacher name
	
	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	// Override method to print teacher name in readable format
	//@Override
	
    public String toString() {
        return (teacherName);
    }
}

