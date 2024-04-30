package cricket;

import java.util.Scanner;

public class Cricketer extends Player implements Batter, Bowler {
	private int runs;
	private int wickets;
	
	public Cricketer() {
	}
	
	public Cricketer(int runs, int wickets) {
		super();
		this.runs = runs;
		this.wickets = wickets;
	}


	@Override
	public int getWickets() {
//		System.out.println("Enter wickets");
//		int wickets = sc.nextInt();
		return wickets;
	}

	@Override
	public int getRuns() {
//		System.out.println("Enter runs");
//		runs = sc.nextInt();
		return runs;
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter runs");
		runs = sc.nextInt();
		System.out.println("Enter wickets");
		wickets = sc.nextInt();
	}
	
	@Override
	public String toString() {
		return super.toString() + "Runs -" + runs + "Wickets -" + wickets;
	}

}
