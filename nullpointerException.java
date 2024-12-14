package testException;

public class nullpointerException {

	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println(str.toUpperCase());
		}
		catch(NullPointerException n) {
			System.out.println(n);
			System.out.println("so im wright n a");
		}

	}

}
