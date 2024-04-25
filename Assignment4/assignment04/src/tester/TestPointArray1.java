package tester;

import java.util.Arrays;
import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of points you want to enter:");
		
		Point2D [] points = new Point2D[sc.nextInt()];
		
		for(int i=0; i< points.length; i++)
		{
			System.out.println("Enter x and y co-ordinates");
			int x = sc.nextInt();
			int y = sc.nextInt();
			points[i] = new Point2D(x,y); 
		}
		
		int choice = 0;
		do
		{
			System.out.println("Enter your choice:");
			System.out.println("0.Exit");
			System.out.println("1.Display details of a specific point");
			System.out.println("2.Display all points");
			System.out.println("3.calculate distance between 2 points");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 0: 
					break;
					
				case 1:
					System.out.println("Enter the index of a point");
					System.out.println(points[sc.nextInt()].getDetails());
					break;
				
				case 2:
					for(Point2D element:points)
						{
							System.out.print(element.getDetails());
						}
					break;
				
				case 3:
					System.out.println("Enter the index of first point");
					int p1 = sc.nextInt();
					System.out.println("Enter the index of second point");
					int p2 = sc.nextInt();
					
					if((p1 >= 0 && p1 < points.length) && (p2 >= 0 && p2 < points.length))
					{
						if(points[p1].isEqual(points[p2]))
						{
							System.out.println("Points are at same position.");
						}
						else
						{
							double distance = points[p1].calculateDistance(points[p2]);
							System.out.println("Distance between points = " + distance);
						}
					}
					else
					{
						System.out.println("Please enter correct index");
					}
					break;
				
				default:
					System.out.println("Enter correct choice");
			}
		}while(choice != 0);

	}

}
