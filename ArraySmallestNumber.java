package array_programs;

import java.util.Scanner;

public class ArraySmallestNumber 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array size :");
		int size = scanner.nextInt();
		int []arr = new int[size];
		
		System.out.println("Enter the array Elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		int smallest = small(arr);
		System.out.println("the smallest element in the array is :"+smallest);
		
	}
		public static int small(int a[])
		{
			int smalles = a[0];
			
			for (int i=1;i<a.length;i++)
			{
				if(smalles>a[i])
				{
					smalles = a[i];
				}
			}
			return smalles;
		}

	

}
