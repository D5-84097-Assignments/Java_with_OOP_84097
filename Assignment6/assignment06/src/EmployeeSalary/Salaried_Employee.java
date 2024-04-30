package EmployeeSalary;

import java.util.Scanner;

public class Salaried_Employee extends Employee {
	private int weeklySalary;
	
	public Salaried_Employee() {
	}

	public Salaried_Employee(int weeklySalary) {
		super();
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter Weekly Salary");
		weeklySalary = sc.nextInt();
	}
	
	@Override
	public void display() {
		super.display();
	}
	
	@Override
	public void calculateSalary() {
		System.out.println("Total Salary - "+ weeklySalary);
		
	}
	
	
}
