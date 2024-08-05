// 16. Shape.java : This is subclass of Shape.java which implements abstract methods area and perimeter for circle

package shapeCalculations;

class Circle extends Shape {
    
    private double radius;

    // Constructor 
    
    public Circle(double radius) {
    	
        this.radius = radius;
    }

    // Abstract method area implementation for circle
  
    public double area() {
        
        return Math.PI * radius * radius;
    }

 	// Abstract method perimeter implementation for circle
   
    public double perimeter() {
       
        return 2 * Math.PI * radius;
    }
}