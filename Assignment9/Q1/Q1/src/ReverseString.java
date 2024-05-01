import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		StringBuilder s = new StringBuilder(sc.next());
		System.out.println("Reversed string is- " + s.reverse());
		
		
		sc.close();
	}

}
