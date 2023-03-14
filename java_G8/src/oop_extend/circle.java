package oop_extend;

public class circle extends shape {
   private double radius;
   public circle() {
	// TODO Auto-generated constructor stub
	   super();
	   radius = 1;
}

  public circle (double radius,String color, boolean filled) {
	  super(color, filled);
	  this.radius = radius;
  }
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
  public double getArea() {
	  return Math.PI * Math.pow(radius, 2);
  }
  public double getperimeter() {
	  return 2 * Math.PI * radius;
  }
@Override
public String toString() {
	return String.format("circle[%s,radius=%f",super.toString(),radius);
}
  
}