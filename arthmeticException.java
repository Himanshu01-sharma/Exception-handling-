package Practisecoding;
import java.util.*;

// here im handing he arithmetic EXCEPTION
public class arthmeticException {

	public static void main(String[] args) throws ArithmeticException{
		System.out.println("handling arithmetic Exception");
		try {
		int a = 10/0;
			System.out.println("here ");
		}
		
catch(Exception e) {
	System.out.println(e);
	System.out.println("having he good desire of the world");
}
	}

}
