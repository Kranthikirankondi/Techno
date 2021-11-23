package array_programs;

import java.util.Scanner;

public class ArraySecondLongestElement 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		int size = scanner.nextInt();
		int []arr = new int[size];
		
		System.out.println("Enter the array :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		int large= arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(large<arr[i])
			{
				large = arr[arr.length-2];
			}
		}
		
        System.out.println("The SecondLargest Array is : "+(large));


	}

}
