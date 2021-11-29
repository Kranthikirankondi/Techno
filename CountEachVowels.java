package stringPrograms;

import java.util.Scanner;

public class CountEachVowels 
{

	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.nextLine();
		
		int  ca=0, ce=0, ci=0, co=0,cu=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			
			switch(ch)
			{
				case'a' : ca++; break;
				case'e' : ce++; break;
				case'i' : ci++; break;
				case'o' : co++; break;
				case'u' : cu++; break;
			}
		}
		
		if(ca>0)
			System.out.println("the vowels are 'a' is present " + ca);
		

		if(ce>0)
			System.out.println("the vowels are 'e' is present " + ce);
		

		if(ci>0)
			System.out.println("the vowels are 'i' is present " + ci);
		

		if(co>0)
			System.out.println("the vowels are 'o' is present " + co);
		

		if(cu>0)
			System.out.println("the vowels are 'u' is present " + cu);

	}

}
