package testException;

public class arthmaticException {

	public static void main(String[] args) {
		int a =4 ;
		try {
			System.out.println(a/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("im here babay");
		}
	}

}
