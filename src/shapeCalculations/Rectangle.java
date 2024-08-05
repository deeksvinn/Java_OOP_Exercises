// 16. Shape.java : This is subclass of Shape.java which implements abstract methods area and perimeter for rectangle.

package shapeCalculations;

class Rectangle extends Shape {
	
	 double length;
	 double width;

	// Constructor
	 
	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
	}
	
	// Abstract method area implementation for rectangle

	public double area() {
		
		return length * width;
	}

	// Abstract method perimeter implementation for rectangle
	
	public double perimeter() {
	
		return 2 * (length + width);
	}
}
	
	