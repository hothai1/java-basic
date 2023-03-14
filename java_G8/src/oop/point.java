package oop;

import java.awt.Point;

public class point {
    private int x, y;
    //khoi tao ko tham so
    public int getX() {
    	return x;
    }
    public void setX(int x) {
    	this.x = x;
    }
    public int getY() {
    	return y;
    }
    public void setY(int y){
    	this.y = y;
    }
    //khoi tao co tham so
    public point() {
    	x = 0;
    	y = 0;
    }
	public point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	//khoi tao ke thua
	public point(Point p) {
		x = p.x;
		y = p.y;
	}
	//khoang cach toi goc toa do o(0,0)
	//return khoang cach d(p,0)
	public double Distance() {
		double d = Math.sqrt(Math.pow(x, 2)+ Math.pow(y,2));
		return d;
	}
	//khoang cach toi goc toa do p(x,y)
		//diem can tinh  khoang cach
		//return khoang cach d(.,p)
	public double Distance(point p) {
		double d = Math.sqrt(Math.pow(x-p.x,2) + Math.pow(y-p.y,2));
		return d;
	}
	public static double Distance (Point a, Point b) {
	//ouble d = Math.sqrt(Math.pow(a-x.x,2)+Math.pow(b-y.y,2));
	//eturn d;
		return a.distance(b);
	}
	
	
	
	
		

    
}