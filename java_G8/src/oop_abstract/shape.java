package oop_abstract;

public abstract class shape {
   protected String color ;
   protected boolean filled;
   public shape() {
	color = "red";
	filled = true;
}
   public shape(String color, boolean filled) {
	   this.color = color;
	   this.filled = filled;
   }
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public boolean isFilled() {
	return filled;
}
public void setFilled(boolean filled) {
	this.filled = filled;
}
   abstract double getArea();
   abstract double getperimeter();
@Override
public String toString() {
	return String.format("shape[color = %s,filled = %s",color,filled);
}
   
}
