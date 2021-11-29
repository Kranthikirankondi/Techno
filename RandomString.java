package stringPrograms;

import java.util.Random;

public class RandomString 
{

	public static void main(String[] args) 
	{
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		Random r = new Random();
		 int l = 5;
		 for (int i=1;i<l;i++)
		 {
			 int n = r.nextInt(s.length());
			 char rc = s.charAt(n);
			 sb.append(rc);
		 }
			 String sr = sb.toString();
			 System.out.println(sr);
		 
	}

}
