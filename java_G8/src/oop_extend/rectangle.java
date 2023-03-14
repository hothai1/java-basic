package oop_extend;

public class rectangle extends shape {
 private double w, l;
 
 public rectangle() {
	 super();
	 w = l = 1;
	 // TODO Auto-generated constructor stub
}

public rectangle(double w, double l) {
	super();
	this.w = w;
	this.l = l;
}
public rectangle(double w, double l, String color, boolean filled) { 
	super(color, filled);
	this.w = w;
	this.l = l;
}
public double getArea() {
	return w * l;
}
public double getperimeter() {
	return (w + l) * 2;
}

@Override
public String toString() {
	return String.format(, null)
	
	
	
	
	
	
	
	
	
	
	
	
}

}
