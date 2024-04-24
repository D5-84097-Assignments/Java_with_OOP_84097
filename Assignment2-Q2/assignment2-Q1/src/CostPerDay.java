import java.util.Scanner;

public class CostPerDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total miles driven per day");
		float distance = sc.nextFloat();
		System.out.println("Enter cost per gallon of gasoline");
		float cost_per_gallon = sc.nextFloat();
		System.out.println("Enter Average miles per gallon");
		float average = sc.nextFloat();
		System.out.println("Enter Parking fees per day");
		float parking_fees = sc.nextFloat();
		System.out.println("Enter Tolls per day");
		float toll_fees = sc.nextFloat();
		float cost_per_day = ((distance / average)* cost_per_gallon) + parking_fees + toll_fees;
		System.out.println("Enter cab ride price per mile");
		float pool_charges = sc.nextFloat();
		float pool_price = distance * pool_charges;
		System.out.println("Cost per day :" + cost_per_day);
		System.out.println("Pool car cost per day :" + pool_price);
		System.out.println("Cost saved per day :" + (cost_per_day - pool_price));
	}

}
