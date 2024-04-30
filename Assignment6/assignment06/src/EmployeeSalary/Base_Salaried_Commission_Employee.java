package EmployeeSalary;

import java.util.Scanner;

public class Base_Salaried_Commission_Employee extends Commission_Employee {
	private int baseSalary;
	
	public Base_Salaried_Commission_Employee() {
	}

	public Base_Salaried_Commission_Employee(int baseSalary) 
	{
		this.baseSalary = baseSalary;
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter base salary");
		baseSalary = sc.nextInt();
	}
	
	@Override
	public void display() {
		super.display();
	}
	
	@Override
	public void calculateSalary() {
		System.out.println("Total salary - "+ ((1.1*baseSalary) + 0.1*getGrossSales()));
	}
	
	
}
