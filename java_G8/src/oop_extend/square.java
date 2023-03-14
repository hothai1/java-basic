package oop_extend;

public class square extends rectangle {
  public square() {
	  super();
  }
  public square(double side) {
	  super(side,side);
  }
  public square(double side, String color, boolean filled) {
	  super(side,side,color,filled);
  }
  
  
public double getside() {
	return getw();
}
public void setside(double side) {
	setw(side);
	setl(side);
}
  
  
  
  
  
  
@Override
public String toString() {
	return String.format("square[%s]",super.toString());
}
  
  
}
