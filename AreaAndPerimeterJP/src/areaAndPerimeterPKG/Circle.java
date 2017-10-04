package areaAndPerimeterPKG;       // declared a package

public class Circle extends Figure{               // declared and defened a class that extends a super class
	
	double pi = Math.PI;               // Getting a PI value from a Math Function
	double circleDiameter;                   // declared a variable of a double type
	double circleRadius;                       // declared a variable of a double type
	
	// Using parameterized constructor for assigning the user diameter value to the Super class diameter variable
	
	Circle(double circleDiameter)       
	{
		super.circleDiameter = circleDiameter;                    // Assigning a diameter to super class diameter variable
		this.circleDiameter=super.circleDiameter ;                // Assigning super class diameter value to Circle class variable
		circleRadius = (this.circleDiameter/2);             // From diameter, getting a radius 
	}
         
	
	public void findArea()                                  // Implemented Abstract method findArea of Figure class
	{		
		double circleArea = Math.round((pi * Math.pow(circleRadius, 2)) * 100);      // Finding the area of a circle and multiplying it by 100 and rounding it
		circleArea /= 100;                          // Taking the area of a circle upto 2 decimal value
		
		System.out.println();                                              // printing a blank line
		System.out.println("********************************* CIRCLE ***************************************"); // printing a info line
		System.out.println();                                                 // printing a blank line
		System.out.println("Area of a Circle with Diamter "+super.circleDiameter+" is       : "+ circleArea); // Printing Area of a circle
	}
	
	public void findPerimeter()                                       // Implemented Abstract method findPerimeter of Figure class
	{
		double circlePerimeter = Math.round((2 * pi * circleRadius) * 100); // Finding the Perimeter of a circle and multiplying it by 100 and rounding it
		circlePerimeter /= 100;         // Taking the perimeter of a circle upto 2 decimal value
		
		System.out.println("Perimeter of a Circle with Diamter "+super.circleDiameter+" is  : "+circlePerimeter); // Printing perimeter of a circle
	}
}
