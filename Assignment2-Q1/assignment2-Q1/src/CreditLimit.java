import java.util.Scanner;

public class CreditLimit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Allowed credit");
		int allowed_credit = sc.nextInt();
		System.out.println("Enter Pending balance at the begining of month");
		int begining_balance = sc.nextInt();
		System.out.println("Enter total items charged by the customer");
		int charges = sc.nextInt();
		System.out.println("Enter total credit applied to customer's account");
		int credits = sc.nextInt();
		int new_balance = begining_balance + charges - credits;
		if(new_balance < allowed_credit)
		{
			System.out.println("New balance for next month = " + new_balance);
		}
		else
		{
			System.out.println("Credit limit exceeded");
		}

	}

}
