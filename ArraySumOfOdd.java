package array_programs;

import java.util.Scanner;

public class ArraySumOfOdd 
{

		public static void main(String[] args) 
		{

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Array Size:");
			int size = scanner.nextInt();
			int []arr = new int[size];
			
			int sum = 0;
			System.out.println("Enter the Array :");
			for (int i =0;i<arr.length;i++)
			{
				arr[i]=scanner.nextInt();
				
				if(i%2==1)
				{
					sum+=arr[i];
				}
			}
	        System.out.println("The sum of the Array Odd Numbers is : "+sum );

	}

}
