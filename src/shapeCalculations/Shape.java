// 16. Write a Java program to create a class called "Shape" with abstract methods for 
// calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle". 

package shapeCalculations;

abstract class Shape {
	
	 // Declaring abstract methods area and perimeter 
	
	 public abstract double area();
	 public abstract double perimeter();
	
	 // Main method
	 
	 public static void main(String[] args) {
		
		// Passing values of attributes for respective shapes
		 
		Shape rectangle = new Rectangle(1.0,2.0);
		Shape circle = new Circle(2.0);
		Triangle triangle = new Triangle(1.0,2.0,3.0,4.0,5.0);
		
		
		// Printing area and perimeter of rectangle,circle and triangle
		
		System.out.println("Area of rectangle : "+ rectangle.area());
		System.out.println("Perimeter of rectangle :  "+ rectangle.perimeter());
		System.out.println("Area of circle :  " + circle.area());
		System.out.println("Perimeter of circle : " + circle.perimeter());
		System.out.println("Area of triangle : " + triangle.area());
		System.out.println("Perimeter of triangle : " + triangle.perimeter());

	}
}
