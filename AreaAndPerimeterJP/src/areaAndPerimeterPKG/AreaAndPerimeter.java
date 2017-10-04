package areaAndPerimeterPKG;                // Declared package

import java.util.Scanner;             // using scanner utility

public class AreaAndPerimeter {          // declared and defined class

	public static void main(String[] args) {          // Main method


		Scanner input = new Scanner(System.in);        // Creating a Scanner Class object to take the dynamic inputs
		
		System.out.println();                         // Printing a blank line
		System.out.println("Enter the Circle Diameter:");    // Printing info
		double cDiameter = input.nextDouble();             // taking a dynamic value and assigning it to a variable of double type
		
		System.out.println("Enter the Rectangle Width:");    // Printing info
		double rWidth = input.nextDouble();             // taking a dynamic value and assigning it to a variable of double type
		
		System.out.println("Enter the Rectangle Height:");    // Printing info
		double rHeight = input.nextDouble();             // taking a dynamic value and assigning it to a variable of double type
		
		System.out.println("Enter the Triangle Base:");    // Printing info
		double tBase = input.nextDouble();             // taking a dynamic value and assigning it to a variable of double type
		
		System.out.println("Enter the Triangle Height:");    // Printing info
		double tHeight = input.nextDouble();             // taking a dynamic value and assigning it to a variable of double type
		
		System.out.println("Enter the 3rd Side of Triangle to find a Perimeter:");    // Printing info
		double tThirdSide = input.nextDouble();             // taking a dynamic value and assigning it to a variable of double type
		
		Circle c = new Circle(cDiameter);            // Creating an object of Circle Class
		c.findArea();                                // Calling a findArea method 
		c.findPerimeter();                            // Calling a findPerimeter method 
		
		Rectangle r = new Rectangle(rWidth,rHeight);            // Creating an object of Rectangle Class
		r.findArea();                                // Calling a findArea method 
		r.findPerimeter();                            // Calling a findPerimeter method 
		
		Triangle t = new Triangle(tBase,tHeight,tThirdSide);            // Creating an object of Rectangle Class
		t.findArea();                                // Calling a findArea method 
		t.findPerimeter();                            // Calling a findPerimeter method 

		input.close();        // closed scanner
	}

}
