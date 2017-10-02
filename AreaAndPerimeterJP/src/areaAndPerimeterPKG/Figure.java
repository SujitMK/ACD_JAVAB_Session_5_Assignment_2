package areaAndPerimeterPKG;

public abstract class Figure {
	
	double circleDiameter;        //Declared a diameter variable of double type 
	double rectangleHeight;       //Declared a Rectangle Height variable of double type
	double rectangleWidth;        //Declared a Rectangle Width variable of double type
	double triangleBase;          //Declared a Triangle base variable of double type   
	double triangleHeight;        //Declared a Triangle Height variable of double type
	
	abstract void findArea();           // declared an abstract method for Area
	abstract void findPerimeter();      // declared an abstract method for Perimeter

}
