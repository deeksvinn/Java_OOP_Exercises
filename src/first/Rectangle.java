// 3. Write a Java program to create a class called "Rectangle" with width and height attributes. 
// Calculate the area and perimeter of the rectangle.

package first;

public class Rectangle {
	
	int width;
	int height;
	
	// Constructor

	public Rectangle(int width,int height) {
		
		this.width = width;
		this.height = height;
		
	}

	// Get and set methods for width and height
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// Method to find area
	
	public int area() {
		return width * height ;
		
	}
	
	// Method to find perimeter
	
	public int perimeter() {
			return 2 * (width + height);
		
	}
	
	// Main method
	
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(2,5);
		Rectangle rectangle2 = new Rectangle(10,20);
		
		System.out.println("Area of first rectangle is " + rectangle1.area());
		System.out.println("Perimeter of first rectangle is " + rectangle1.perimeter());
		System.out.println("\n");
		System.out.println("Area of second rectangle is " + rectangle2.area());
		System.out.println("Perimeter of second rectangle is " + rectangle2.perimeter());
	}

}
