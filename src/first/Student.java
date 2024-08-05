// 10. Write a Java program to create a class called "Student" with a name, grade, and courses attributes,
// and methods to add and remove courses.

package first;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String studentName;
    private int grade;
    private ArrayList<String> courses;

    // Constructor
    public Student(String studentName, int grade) {
        this.studentName = studentName;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    // Get methods for student name and grade
    
    public String getstudentName() {
        return studentName;
    }

    public int getGrade() {
        return grade;
    }

    // Get method for courses
    
    public ArrayList<String> getCourses() {
        return courses;
    }

    // Method to add a course
    
    public void addCourse(String course) {
        courses.add(course);
    }

    // Method to remove a course
    
    public void removeCourse(String course) {
        courses.remove(course);
    }
    
    // Method to take student name and grade through user input
    
    public static Student createStudent() {
    	
        Scanner scanner = new Scanner(System.in);

        // User input for student name
        System.out.println("Enter  student name:");
        String studentName = scanner.nextLine();
        
        // User input for student grade
        System.out.println("Enter grade of the student:");
        int grade = scanner.nextInt();
        scanner.close();
        // Returns new student details
        return new Student(studentName, grade);
        
    }

    // Method to print student details
    
    public void printStudentDetails() {
    	
        System.out.println("Student name: " + studentName);
        System.out.println("Student grade: " + grade);
        System.out.println("Enrolled Courses: " + courses);
    }

    public static void main(String[] args) {
    	
    	// Adding first student
        Student student1 = Student.createStudent();

        // Add courses
        student1.addCourse("Maths");
        student1.addCourse("English");

        // Print student details
        student1.printStudentDetails();

        // Remove a course
        student1.removeCourse("Maths");

        // Print student details again after removing a course
        System.out.println("First student details after removing a course");   
        student1.printStudentDetails();
        
        // Adding second student
        Student student2 = Student.createStudent();       
        student2.addCourse("Science");
        student2.printStudentDetails();
    }
}