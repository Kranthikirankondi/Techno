package stringPrograms;

import java.util.Scanner;

public class CheckStringCharacter
{

	public static void main(String[] args) 
	{
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter the String  :");
	  String string = scanner.next();
	  
	  System.out.println("Enter the Character");
	  char ch = scanner.next().charAt(0);
	  
	  boolean ispresent = false;
	  
	  for(int i=0;i<string.length();i++)
	  {
		  if(ch==string.charAt(i))
		  {
			  ispresent =true;
			  break;
		  }
	  }
	  
	  if(ispresent == true)
	  {
		  System.out.println("is present in the String");
	  }
	  else
	  {
		  System.out.println("is not in string");
	  }
	  

	}

}
