package array_programs;

import java.util.Scanner;

public class ArraySortingProgram 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array of Size");
		int size = scanner.nextInt();
		int []arr = new int[size];
		
		System.out.println("Enter the Array elements :");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
			
		}
		
		arr = sort(arr);
		
		System.out.println("After Sorting ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		}

	 public static int[] sort(int a[])
	 {
		 
		 for(int i =0;i<a.length;i++) 
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]>a[j])
				 {
					 int temp =a[i];
					 a[i] = a[j];
					 a[j] = temp;
				 }
			 }
		 }
		 return a;
	}
	 

}
