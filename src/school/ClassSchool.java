// 14. School.java : This is subclass ClassSchool for school.java which has individual class details with classname,teacher name and students

package school;

import java.util.ArrayList;

public class ClassSchool {

	private String className;
	private Teacher teacher;
	private ArrayList<Student> students;
	
	// constructor
	
	public ClassSchool(String className,Teacher teacher) {
		this.className = className;
		this.teacher= teacher;
		this.students = new ArrayList<Student>();
	}
	
	// Get and set methods for class,teacher and students
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	public Teacher getTeacher() {
		return teacher;				
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public ArrayList<Student> getStudents(){
		return students;		
	}
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	// Method to print class name in readable format
	@Override
	
    public String toString() {
        return (className);
    }
}
