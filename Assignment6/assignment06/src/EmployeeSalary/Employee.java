package EmployeeSalary;

import java.util.Scanner;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private int SSN;
	
	public Employee() {
	}

	public Employee(String firstName, String lastName, int SSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
	}
	
	public void accept(Scanner sc) 
	{
		System.out.println("Enter first name");
		firstName = sc.next();
		System.out.println("Enter last name");
		lastName = sc.next();
		System.out.println("Enter SSN");
		SSN = sc.nextInt();
	}
	
	public void display()
	{
		System.out.println("First name - "+ firstName);
		System.out.println("Last name - "+ lastName);
		System.out.println("SSN - "+ SSN);
	}
	
	public abstract void calculateSalary();
	

}
