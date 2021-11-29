package stringPrograms;

import stringPrograms.A.MyThread;

public class B  implements Runnable {
	public static void main(String[] args) {
		
		B myThread = new B();
		myThread.run();
	}
	public void run()

	{
		for(int i=1;i<3;++i)
		{



		System.out.print(i+ ",");
	}

	}

}
