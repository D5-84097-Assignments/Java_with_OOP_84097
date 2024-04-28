package app.com.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basket size");
		int size = sc.nextInt();
		Fruit[] basket = new Fruit[size];
		
		int choice = 0;
		int counter = -1;
		do
		{
			System.out.println("Enter your choice");
			System.out.println("1.Add Mango");
			System.out.println("2.Add Orange");
			System.out.println("3.Add Apple");
			System.out.println("4.Display all fruits");
			System.out.println("5.Display fresh fruits");
			System.out.println("6.Mark a fruit as Stale");
			System.out.println("7.View taste of all stale fruits");
			System.out.println("8.Mark all sour fruits stale");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 0: 
					break;
				case 1:
					basket[++counter] = new Mango ("Yellow",120,"Hapus",true);
					break;
				case 2: 
					basket[++counter] = new Orange("Orange",90,"Nagpur",true);
					break;
				case 3: 
					basket[++counter] = new Apple("Red",70,"Kashmiri",true);
					break;
				case 4: 
					for(Fruit element:basket)
					{
						System.out.println("Name-"+ element.getName());
					}
					break;
				case 5: 
					for(Fruit element:basket)
					{
						if(element.isFresh() == true)
						{
							System.out.println("Name-" + element.getName());
							System.out.println("Weight-" + element.getWeight());
							System.out.println("Taste-" + element.taste());
						}
						else
						{
							System.out.println("Fruit is stale.");
						}
					}
					break;
				case 6: 
					System.out.println("Enter index of fruit you want to make stale");
					int index = sc.nextInt();
					if(index < 0 || index >= size)
					{
						System.out.println("Invalid index entered");
					}
					else
					{
						basket[index].setFresh(false);
						System.out.println("isFresh changed to false");
					}
					break;
				case 7: 
					for(Fruit element:basket)
					{
						if(element.isFresh()==false)
						{
							System.out.println("Taste of stale fruit -" + element.taste());
						}
					}
					break;
				case 8: 
					for(Fruit element:basket)
					{
						if(element.taste()=="Sour")
						{
							element.setFresh(false);
						}
					}
					break;
				default: 
					System.out.println("Enter correct choice.");
					break;
			}
		}while (choice != 0);

	}

}
