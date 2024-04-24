package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number co-ordinates");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		Point2D p1 = new Point2D(x1,y1);
		
		System.out.println("Enter second number co-ordinates");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		Point2D p2 = new Point2D(x2,y2);
		
		System.out.println("First point is: " + p1.getDetails());
		System.out.println("Second point is: " + p2.getDetails());
		
		if (p1.isEqual(p2))
		{
			System.out.println("Points are at same position");
		}
		else
		{
			double distance = p1.calculateDistance(p2);
			System.out.println("Points are at different poisition");
			System.out.println("Distance between Points :" + distance);
		}
	}
}
