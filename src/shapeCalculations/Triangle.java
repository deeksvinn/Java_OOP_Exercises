// 16. Shape.java : This is subclass of Shape.java which implements abstract methods area and perimeter for triangle

package shapeCalculations;

public class Triangle extends Shape{
	
	double base;
	double height;
	double side1;
	double side2;
	double side3;
	
	// Constructor
	
	public Triangle(double base, double height, double side1, double side2, double side3) {
		
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// Abstract method area implementation for triangle
	
	public double area() {
		
		return (base * height) / 2;
	}

	// Abstract method perimeter implementation for triangle
	
	public double perimeter() {
	
		return side1+side2+side3;
	}
}
