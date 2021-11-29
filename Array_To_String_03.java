package stringPrograms;

public class Array_To_String_03 {

	public static void main(String[] args) 
	{
		char [] ch = {'h','a','i'};
		String string = new String ();
		for(int i =0;i<ch.length;i++)
		{
			string+= ch[i];
		}
		System.out.println(string);
	}
}
