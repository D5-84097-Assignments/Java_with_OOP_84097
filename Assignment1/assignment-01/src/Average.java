import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		double num1 = 0,num2=0;
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter a first no.");
		if(sc1.hasNextDouble())
		{
			num1 = sc1.nextDouble();
			System.out.println("Enter a second no.");
			if(sc2.hasNextDouble())
			{
				num2 = sc2.nextDouble();
				System.out.println("Average = "+ ((num1 + num2)/2));
			}
			else
			{
				System.out.println("Number is not of double type");
			}	
		}
		else
		{
			System.out.println("Number is not of double type");
		}

	}

}
