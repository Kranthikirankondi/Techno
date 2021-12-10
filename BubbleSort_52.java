package arraysPrograms;
//wap to achieve bubble sort
public class BubbleSort_52 {

	public static void main(String[] args) {
			int a[ ] = {20,89,45,10};
			for (int i = 0; i < a.length; i++) 
			{
				for (int j = 0; j < a.length-i-1; j++) 
				{
					if( a[j] >a[j+1] );
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
			}
			System.out.println("result");
			for (int i = 0; i < a.length; i++) 
			{
				System.out.println(a[i]+" ");

			}
	}

}
