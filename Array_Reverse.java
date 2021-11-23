package array_programs;
import java.util.Scanner;

public class Array_Reverse
{
      public int o=10;
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the  Array Size : ");
		int size = scanner.nextInt();
		int []arr = new int[size];
		
		System.out.println("Enter the array :");
		for(int i = 0;i<arr.length;i++) 
		{
			arr[i] = scanner.nextInt();
			
		}
        
		System.out.println("************************");
		System.out.println("Reversing Array....");
		
		for(int i = arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		

	}

}
