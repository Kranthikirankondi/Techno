package stringPrograms;

public class First_Letter_Capital 
{

	public static void main(String[] args) 
	{
		String s = "welcome";
		String fl = s.substring(0,1);
		String Rl = s.substring(1,s.length());
		
		fl = fl.toUpperCase();
		s = fl+Rl;
		System.out.println(s);

	}

}
