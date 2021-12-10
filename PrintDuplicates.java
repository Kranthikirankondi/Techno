package stringPrograms;

import java.util.Scanner;

public class PrintDuplicates 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.next();
		String str1 ="";
		
		for (int i =0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			
			if(str1.indexOf(ch)==-1)
			{
				str1  +=ch;
			}
		}
		
System.out.println("The Duplicate are : "+str1);
	}

}
