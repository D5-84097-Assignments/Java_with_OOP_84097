package cricket;

import java.util.Scanner;

public abstract class Player {
	private int id;
	private String name;
	private int age;
	private int matchesPlayed;
	
	public Player() {
	}

	public Player(int id, String name, int age, int matchesPlayed) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPlayed;
	}
	
	public void accept(Scanner sc)
	{
		System.out.println("Enter Id");
		id = sc.nextInt();
		System.out.println("Enter Name");
		name = sc.next();
		System.out.println("Enter Age");
		age = sc.nextInt();
		System.out.println("Enter Matched played");
		matchesPlayed = sc.nextInt();
	}
	
	
	
	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	

	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Id -"+ id + "Name -"+ name + "Age -"+ age + "Matched Played - "+ matchesPlayed;
	}
	
	
}
