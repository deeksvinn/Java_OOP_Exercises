// 14. Write a Java program to create a class called "School" with attributes for students, teachers,
//and classes, and methods  to add and remove students and teachers, and to create classes. 

package school;

import java.util.ArrayList;

public class School {
	private ArrayList<Student> students;
	private ArrayList<Teacher> teachers;
	private ArrayList<ClassSchool> classes;
	

	// Constructor
	
	public School() {
		
		this.students = new ArrayList<>();
		this.teachers = new ArrayList<>();
		this.classes = new ArrayList<>();
	}

	// Get and set methods for students,teachers and classes
	
	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(ArrayList<Teacher> teachers) {
		this.teachers = teachers;
	}

	public ArrayList<ClassSchool> getClasses() {
		return classes;
	}

	public void setClasses(ArrayList<ClassSchool> classes) {
		this.classes = classes;
	}
	
	// Add methods for student,teacher and classes
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	public void addClasses(ClassSchool className) {
		classes.add(className);
	}
	
	// Remove methods for student,teacher,class
	
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	public void removeTeacher(Teacher teacher) {
		teachers.remove(teacher);
	}
	
	public void removeClass(ClassSchool className) {
		classes.remove(className);
	}
	
	// Main method
	
	public static void main(String[] args) {
		
		School school = new School();
		
		// New students
		Student student1 = new Student("Thomas");
		Student student2 = new Student("Chris");
		Student student3 = new Student("Teddy");
		Student student4 = new Student("Sian");
		Student student5 = new Student("Camy");
		
		// New teachers
		Teacher teacher1 = new Teacher("Mr Walsh");
		Teacher teacher2 = new Teacher("Mrs Griggs");
		Teacher teacher3 = new Teacher("Mr Stewart");
		
		// New classes
		ClassSchool classSchool1 = new ClassSchool("Year1",teacher1);
		ClassSchool classSchool2 = new ClassSchool("Year5",teacher2);
		ClassSchool classSchool3 = new ClassSchool("Year3",teacher3);
		
		// Adding students to the school
		school.addStudent(student1);
		school.addStudent(student2);
		school.addStudent(student3);
		school.addStudent(student4);
		school.addStudent(student5);
		
		// Adding teachers to the school
		school.addTeacher(teacher1);
		school.addTeacher(teacher2);
		school.addTeacher(teacher3);
		
		// Adding classes to the school	
		school.addClasses(classSchool1);
		school.addClasses(classSchool2);
		school.addClasses(classSchool3);
		
		// Printing school details BEFORE removing any student,teacher or class
		System.out.println("Details of the school BEFORE removing any student,teacher or class:\n");
		System.out.println("Students in the school :" + school.students);
		System.out.println("Teachers in the school :" + school.teachers);
		System.out.println("Classes in the school :" + school.classes);
		
		// Removing student,teacher and class
		school.removeStudent(student5);
		school.removeTeacher(teacher3);
		school.removeClass(classSchool3);
		
		// Printing school details AFTER removing any student,teacher or class
		System.out.println("\nDetails of the school AFTER removing any student,teacher or class:\n");
		System.out.println("Students in the school :" + school.students);
		System.out.println("Teachers in the school :" + school.teachers);
		System.out.println("Classes in the school :" + school.classes);
		
		// Adding students to the classes
		classSchool1.addStudent(student1);
		classSchool1.addStudent(student2);
		classSchool2.addStudent(student3);
		classSchool2.addStudent(student4);
		
		// Printing class details along with teacher and students
		System.out.println("\nClass Details:\n");
		System.out.println("Class Name: " + classSchool1.getClassName() + "\tTeacher Name:" +teacher1.getTeacherName() + "\tStudents:" +classSchool1.getStudents());
		System.out.println("Class Name: " + classSchool2.getClassName() + "\tTeacher Name:" +teacher2.getTeacherName() + "\tStudents:" +classSchool2.getStudents());				
	}
}
