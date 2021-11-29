package stringPrograms;

import java.util.Scanner;

public class AddCharacter 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine ();
		System.out.println("Enter the index number to add character :");
		int n = sc.nextInt();
		System.out.println("Enter to add the character :");
		char ch =sc.next().charAt(0);
		System.out.println("before Adding : "+str);
		String s =" ";
		
		for(int i=0;i<str.length();i++)
		{
			s += str.charAt(i);
			
			if(i==n-1)
			{
				s += ch;
			}
			
			
		}
		System.out.println("After Adding : "+s);
		

	}

}
