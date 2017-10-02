package areaAndPerimeterPKG;

public class Triangle extends Figure{
	
    //  Declaring width,height and 3rd side of a Triangle variables of double type
	double tBase;         
	double tHeight;
	double tThirdSide;
	
	// Using parameterized constructor for assigning the user diameter value to the Super class diameter variable
	
	Triangle(double tBase, double tHeight, double tThirdSide)            
	{
		// Assigning the local variable values to the global variable values
		this.tBase  = tBase;
		this.tHeight = tHeight;
		this.tThirdSide = tThirdSide;
	}
	
	public void findArea()                                  // Implemented Abstract method findArea of Figure class
	{		
		double triArea = Math.round(((this.tBase * this.tHeight) / 2) * 100);      // Finding the area of a triangle and multiplying it by 100 and rounding it
		triArea /= 100;                          // Taking the triangle of a circle upto 2 decimal value
		
		System.out.println();                                              // printing a blank line
		System.out.println("********************************* TRIANGLE ************************************"); // printing a info line
		System.out.println();                                                 // printing a blank line
		System.out.println("Area of a Triangle with Base "+this.tBase+ " and Height "+this.tHeight+" is                     : "+ triArea); // Printing Area of a Triangle
	}
	
	public void findPerimeter()                                       // Implemented Abstract method findPerimeter of Figure class
	{
		double triPerimeter = this.tBase + this.tHeight + this.tThirdSide; // Finding the Perimeter of a Triangle and multiplying it by 100 and rounding it
		
		System.out.println("Perimeter of a Triangle with Base "+this.tBase+ ", Height "+this.tHeight+" and 3rd Side "+this.tThirdSide+" is  : "+triPerimeter); // Printing perimeter of a Triangle
	}

}
