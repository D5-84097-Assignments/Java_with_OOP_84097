package com.app.geometry;

public class Point2D {
	int x;
	int y;
	
	public Point2D ()
	{
		
	}
	
	public Point2D(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String getDetails()
	{
		return "(" + x + "," + y + ")";
	}
	
	public boolean isEqual(Point2D other)
	{
		return this.x == other.x && this.y == other.y;
	}
	
	public double calculateDistance (Point2D other)
	{
		double distance = Math.sqrt((Math.pow((other.x-this.x), 2)) + Math.pow((other.y-this.y), 2));
		return distance;
	}
}
