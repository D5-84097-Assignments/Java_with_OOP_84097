package Q1;

import java.util.Scanner;

import Q1.ExceptionLineTooLong;

public class ExceptionHandling {
	
	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in)) 
		{
			System.out.println("Enter the string :");
			String str=sc.next();
			
			if(str.length()>15) 
			{
				throw new ExceptionLineTooLong("String is too long");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Program is finished......");
	}

}

