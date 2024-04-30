package EmployeeSalary;

import java.util.Scanner;

public class Hourly_Employee extends Employee {
	private int wage;
	private int hrs;
	
	public Hourly_Employee() {
	}

	public Hourly_Employee(int wage, int hrs) {
		super();
		this.wage = wage;
		this.hrs = hrs;
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter hourly wages");
		wage = sc.nextInt();
		System.out.println("Enter no. of hours worked");
		hrs = sc.nextInt();
	}
	
	@Override
	public void display() {
		super.display();
	}
	
	@Override
	public void calculateSalary() {
		if(hrs < 40)
		{
			System.out.println("Total Salary - "+ (wage*hrs));
		}
		else
		{
			System.out.println("Total Salary - "+ ((wage*40)+(1.5*wage*(hrs-40))));
		}
		
		
	}
}
