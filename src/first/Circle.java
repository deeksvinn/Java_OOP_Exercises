// 4. Write a Java program to create a class called "Circle" with a radius attribute. 
//You can access and modify this attribute. Calculate the area and circumference of the circle.

package first;

public class Circle {
	
	public double radius;
	
	// Constructor
	
	public Circle(double radius) {
		
		this.radius = radius;
	}

	// Getter and setter methods for radius
	
	public double getRadius() {
		return radius;
	}
	
	public double setRadius(double radius) {
		return this.radius = radius;
	}
	
	public double area() {
		return Math.PI * radius* radius; 
		
	}
	
	// Method to find perimeter
	
	public double perimeter() {
			return 2 * Math.PI * radius;
		
	}
	
	// Main method
	
	public static void main(String[] args) {
		
		Circle circle1 = new Circle(10);
		
		System.out.println("Radius of circle is " + circle1.getRadius());
		System.out.println("Area of circle is  " + circle1.area());
		System.out.println("Perimeter of circle is  " + circle1.perimeter());
		System.out.println("\n");
		
		// Printing with new values
		
		System.out.println("New Radius of circle is " + circle1.setRadius(20));
		System.out.println("New Area of circle is  " + circle1.area());
		System.out.println("New Perimeter of circle is  " + circle1.perimeter());

	}

}
