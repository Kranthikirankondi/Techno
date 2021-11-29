package stringPrograms;

import java.util.Scanner;

public class CountDigitsOfString
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String string = sc.next();
		
		int count=0;
		
		for(int i = 0;i<string.length();i++)
		{
			if(Character.isDigit(string.charAt(i)))
			{
				count++;
			//	System.out.println(string.charAt(i)+" ");
			}
		}
		System.out.println("the count of the digits :"+ count);
	}

}
