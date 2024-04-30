package cricket;

import java.util.Scanner;

public class Program {
	
	public static int menu(Scanner sc)
	{
		System.out.println("Enter your choice");
		System.out.println("0. Exit");
		System.out.println("1. Add player");
		System.out.println("2. Display total runs, wickets and matched played by all players");
		System.out.println("3. Display all cricketers");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int totalRuns = 0;
		int totalWickets = 0;
		int totalMatchesPlayed = 0;
		
		Player[] p = new Player[11];
		
		do
		{
			choice = menu(sc);
			switch(choice)
			{
				case 0:
					System.out.println("Thank You..!");
					break;
					
				case 1:
					for(int i=0; i<2; i++)
					{
						p[i] = new Cricketer();
						p[i].accept(sc);
					}
					break;
					
					
				case 2:
					for(int i=0; i<2; i++)
					{
						Cricketer c = (Cricketer) p[i];
						totalRuns += c.getRuns();
						totalWickets += c.getWickets();
						totalMatchesPlayed += c.getMatchesPlayed();
					}
					System.out.println("Total runs-"+ totalRuns + " , Total wickets- " + totalWickets + " , Total matched played - "+ totalMatchesPlayed);
					break;
					
					
				case 3:
					for(int i=0; i<2; i++)
					{
						Cricketer c = (Cricketer) p[i];
						System.out.println("Name -"+ c.getName() + " , Matches Played - " + c.getMatchesPlayed());
					}
					
					break;
					
					
				default:
					System.out.println("Enter correct choice");
					break;
			}
			
		}while(choice != 0);
		
		
		
		sc.close();
	}

}
