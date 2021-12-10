package stringPrograms;

import java.util.Scanner;

public class CountVowels 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String string = scanner.next();
		
		int count=0;
		for(int i=0;i<string.length();i++)
		{
			char ch =string.charAt(i);
			
			switch(ch)
			{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U': count++;
			}
		}
		
        System.out.println("the total vowels are : " + count);
	}

}
