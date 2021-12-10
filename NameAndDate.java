package stringPrograms;

import java.util.Scanner;

public class NameAndDate 
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		System.out.println("Enter the todays date :");
		String str1 = sc.nextLine();
		
		String res= str + " "+str1;
		System.out.println("Result is :" +res);
		
		

	}

}
