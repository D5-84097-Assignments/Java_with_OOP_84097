package EmployeeSalary;

import java.util.Scanner;

public class Commission_Employee extends Employee {
	private int grossSales;
	private int commissionRate;
	
	public Commission_Employee() {
	}

	public Commission_Employee(int grossSales, int commissionRate) {
		super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter gross sales");
		grossSales = sc.nextInt();
		System.out.println("Enter conmmission rate");
		commissionRate = sc.nextInt();
	}
	
	
	public int getGrossSales() {
		return grossSales;
	}
	
	@Override
	public void display() {
		super.display();
	}


	@Override
	public void calculateSalary() {
		System.out.println("Total Salary - "+ (grossSales*commissionRate/100));
		
	}
}
