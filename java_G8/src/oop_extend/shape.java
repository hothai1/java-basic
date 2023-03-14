package oop_extend;

public class shape {
    private String color;
    private boolean filled;
    
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

	@Override
	public String toString() {
		return String.format("shape ", null)
	}
    
    
    
}
