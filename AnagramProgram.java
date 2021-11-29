package stringPrograms;

import java.util.Arrays;

public class AnagramProgram 
{

	public static void main(String[] args) 
	{
		String s1 = "java";
		String s2 = "vaaj";
		
		if(s1.length()==s2.length())
		{
			char[] charArr1 = s1.toCharArray();
			char[] charArr2 = s2.toCharArray();
			
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			
			boolean result = Arrays.equals(charArr1,charArr2);
			if(result)
			{
				System.out.println(s1 +" and "+ s2 + " are anagram.");
				
			}
			else
			{
				System.out.println(s1+ " and "+ s2 +" are not anagram.");
			}
		}
			else
			{
				System.out.println(s1+ " and " + s2 + "are anagram.");
			}
			
			
		}

	}


