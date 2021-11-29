package stringPrograms;

import java.util.Scanner;

public class CountExceptSpace
{

	public static void main(String[] args) 
	{
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter the Sentense :");
	   String str = scanner.nextLine();
	   
	   int count = 0;
	   for(int i=0;i<str.length();i++)
	   {
		   char ch = str.charAt(i);
		   
		   if(ch!=' ')
		   {
			   count++;
		   }
	   }

	   System.out.println("The count of the character Without Space is : "+count);
	}

}
