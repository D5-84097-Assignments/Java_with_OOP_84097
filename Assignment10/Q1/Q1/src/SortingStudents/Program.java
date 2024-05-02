package SortingStudents;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		Student[] arr = { new Student(101,"Amit",94),
						  new Student(105,"Akshay",87),
						  new Student(103,"Pranav",65),
						  new Student(102,"Sameer",77),
						  new Student(104,"Chinmay",91)};
		
		System.out.println("Before sorting");
		for(Student element:arr)
			System.out.println(element);
		
		Arrays.sort(arr);
		
		System.out.println("After sorting");
		for(Student element:arr)
			System.out.println(element);

	}

}
