package areaAndPerimeterPKG;

public class Rectangle extends Figure{

	//  Declaring width and height variables of double type
	double rWidth;         
	double rHeight;
	
	// Using parameterized constructor for assigning the user diameter value to the Super class diameter variable
	
	Rectangle(double rWidth, double rHeight)            
	{
		// Assigning the local variable values to the global variable values
		this.rWidth  = rWidth;
		this.rHeight = rHeight;
	}
	
	public void findArea()                                  // Implemented Abstract method findArea of Figure class
	{		
		double rectArea = Math.round((this.rWidth * this.rHeight) * 100);      // Finding the area of a rectangle and multiplying it by 100 and rounding it
		rectArea /= 100;                          // Taking the rectangle of a circle upto 2 decimal value
		
		System.out.println();                                              // printing a blank line
		System.out.println("********************************* RECTANGLE ************************************"); // printing a info line
		System.out.println();                                                 // printing a blank line
		System.out.println("Area of a Rectangle with Width "+this.rWidth+ " and Height "+this.rHeight+" is      : "+ rectArea); // Printing Area of a rectangle
	}
	
	public void findPerimeter()                                       // Implemented Abstract method findPerimeter of Figure class
	{
		double rectPerimeter = Math.round(((2 * this.rWidth) + (2 * this.rHeight)) * 100); // Finding the Perimeter of a rectangle and multiplying it by 100 and rounding it
		rectPerimeter /= 100;         // Taking the perimeter of a rectangle upto 2 decimal value
		
		System.out.println("Perimeter of a Triangle with Width "+this.rWidth+ " and Height "+this.rHeight+" is  : "+rectPerimeter); // Printing perimeter of a rectangle
	}
}
