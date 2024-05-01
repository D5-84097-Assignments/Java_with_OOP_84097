package tester;
import java.util.Scanner;
import com.app.drawcircle.Circle;

public class ExceptionHandling {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		
		try {
			c.setDiameter(-11);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		System.out.println("Program execution completed...");
	}
	
}
