package EmployeeSalary;

import java.util.Scanner;

public class Program {
	
	public static int menu(Scanner sc)
	{
		System.out.println("Enter your choice:");
		System.out.println("0. Exit");
		System.out.println("1. Salary calculation for Salaried Employee");
		System.out.println("2. Salary calculation for Hourly Employee");
		System.out.println("3. Salary calculation for Commission Employee");
		System.out.println("4. Salary calculation for Base Salaried Commission Employee");
		System.out.println("5. Display details of all employees");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of employees you want to enter");
		int size = sc.nextInt();
		int counter = 0;
		int choice;
		
		Employee[] e = new Employee[size];
		
		do
		{
			choice = menu(sc);
		switch(choice)
		{
			case 0:
				System.out.println("Thank you...!");
				break;
			case 1:
				if(counter<size)
				{
					e[counter] = new Salaried_Employee();
					e[counter].accept(sc);
					e[counter].calculateSalary();
					counter++;
				}
				else
				{
					System.out.println("Employee cannot be added");
				}
				break;
				
			
			case 2:
				if(counter<size)
				{
					e[counter] = new Hourly_Employee();
					e[counter].accept(sc);
					e[counter].calculateSalary();
					counter++;
				}
				else
				{
					System.out.println("Employee cannot be added");
				}
				break;
				
				
			case 3:
				if(counter<size)
				{
					e[counter] = new Commission_Employee();
					e[counter].accept(sc);
					e[counter].calculateSalary();
					counter++;
				}
				else
				{
					System.out.println("Employee cannot be added");
				}
				break;
				
				
			case 4:
				if(counter<size)
				{
					e[counter] = new Base_Salaried_Commission_Employee();
					e[counter].accept(sc);
					e[counter].calculateSalary();
					counter++;
				}
				else
				{
					System.out.println("Employee cannot be added");
				}
				break;
				
				
			case 5:
				for (int i=0; i<counter; i++)
				{
					e[i].display();
					e[i].calculateSalary();
				}
				break;
				
				
			default:
				System.out.println("Enter correct choice");
				break;
		}
		}while(choice != 0);
		
		sc.close();

	}

}
