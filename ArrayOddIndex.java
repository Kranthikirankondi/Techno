package array_programs;

import java.util.Scanner;

public class ArrayOddIndex 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array Size :");
		int size = scanner.nextInt();
		int []arr = new int[size];
		
		System.out.println("enter the array :");
		for(int i =0;i<arr.length;i++)
		{
			if(i%2==1)
			{
				arr[i]=scanner.nextInt();
			}
		}
		
		System.out.println("**************");
		System.out.println("The values are : ");
		for (int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		


	}

}
