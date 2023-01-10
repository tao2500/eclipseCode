package keben;

public class Cylinder {
	double r,h;
	void setR(double m){
		r=m;
	}
	void setH(double i){
		h=i;
	}
	double c,d;
	double getArea(){
		c=3.14159*r*r;
		return c;
	}
	double getVolume(){
		d=getArea()*h;
		return d;
	}
}
