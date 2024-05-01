package com.app.drawcircle;

public class Circle {
	Point2D centerPoint;
	double diameter;
	
	public Circle(){
		centerPoint= new Point2D(0,0);
		diameter=100;
	}
	
	public Circle(Point2D centerPoint,double diameter) {
		this.centerPoint = centerPoint;
		this.diameter = diameter;
	}

	public Point2D getCenterPoint() {
		return centerPoint;
	}

	public void setCenterPoint(Point2D centerPoint) {
		this.centerPoint = centerPoint;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter)throws ExceptionCircle{
		this.diameter = diameter;
		if(this.diameter<0) {
			throw new ExceptionCircle("Diameter can't be negative!");
		}
		
	}
	
}
