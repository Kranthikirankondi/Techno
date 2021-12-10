package arraysPrograms;

import java.util.Scanner;

public class SelectionSort_53 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		
		int a[ ] =  new int[size]; 
		
		System.out.println("enter the values");
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		//sorting
		for (int i = 0; i < a.length-1; i++) 
		{
			int pos = i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[pos] >a[j] )
				{
					pos = j; 
				}
			}
			if(pos!=i)
			{
				int temp = a[i];
				a[i] = a[pos];
				a[pos] = temp;
			}
		}
		System.out.println("result");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");

		}
	}

}
