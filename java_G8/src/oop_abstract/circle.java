package oop_abstract;

public class circle extends shape {
 private double radius;
	@Override
	double getArea() {
		
		return Math.PI * Math.pow(radius,2);
	}

	@Override
	double getperimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
