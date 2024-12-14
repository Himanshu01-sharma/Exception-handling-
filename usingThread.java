package testException;

import java.io.InterruptedIOException;

public class usingThread {
	public static void running() throws InterruptedException {
		for(int i=1;i<10;i++)  {
			
			System.out.println(i);
			Thread.sleep(1000);
		}
	}

	public static void main(String[] args) {
		try {
			running();
			
		}
catch(Exception e) {
	System.out.println(e);
}
	}

}
