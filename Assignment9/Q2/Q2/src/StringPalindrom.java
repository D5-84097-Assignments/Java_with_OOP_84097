import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s1 = sc.next();
		
		StringBuilder s2 = new StringBuilder(s1);
		s2.reverse();
		
		
		if(s1.equals(s2.toString()))
		{
			System.out.println("Entered string is a palindrome");
		}
		else
		{
			System.out.println("Entered string is not a palindrome");
		}
		
		sc.close();

	}

}
