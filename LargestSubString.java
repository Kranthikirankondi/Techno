package stringPrograms;

import java.util.Scanner;

public class LargestSubString 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		
		String arr[] =str.split("");
		int largeSub = arr[0].length();
		
		
		int temp = 0;
		for(int i=1;i<arr.length;i++)
		{
			if(largeSub<arr[i].length())
			{
				largeSub=arr[i].length();
				temp = i;
			}
		}

		System.out.println("the length of largest substring string is :"+largeSub);
		System.out.println("the largest substring string is :"+arr[temp]);
		
	}

}
