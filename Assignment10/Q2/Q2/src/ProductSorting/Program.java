package ProductSorting;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		Products[] arr = {new Products(101,"Mobile","Electronics",15000),
						  new Products(110,"Milton","Bottle",800),
						  new Products(104,"Chava","Books",300),
						  new Products(109,"Uno","Cards",150),
						  new Products(105,"Studds","Helmet",500),
						  new Products(108,"Nike","Shoes",5000),
						  new Products(106,"Fastrack","Watches",3500),
						  new Products(102,"Hard Bodies","Boxing Bag",5500),
						  new Products(107,"Table","Furniture",7000),
						  new Products(103,"Playstation","Electronics",80000)};
		
		
		System.out.println("Before sorting");
		for(Products element:arr)
			System.out.println(element);
		
		Arrays.sort(arr);
		
		System.out.println("Before sorting");
		for(Products element:arr)
			System.out.println(element);

	}

}
