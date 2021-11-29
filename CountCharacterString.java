package stringPrograms;

import java.util.Scanner;

public class CountCharacterString 
{

	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the String..: ");
		String string = scanner.next();
				string=string.toLowerCase();
		
		System.out.println("Enter the Character...: ");
		char ch = scanner.next().charAt(0);
		      ch=Character.toLowerCase(ch);
		      
		      
		      int count=0;
		      
		      for(int i=0;i<string.length();i++)
		      {
		    	  if(ch==string.charAt(i))
		    	  {
		    		  count++;
		    	  }
		      }
		      
		System.out.println(ch+" is present "+count+"times");
		

	}

}
