package testException;
import java.util.*;

public class integerparseException {

	public static void main(String[] args) {
	String str = "himasnhu";
	try {
		int s = Integer.parseInt(str);
	}
catch(NumberFormatException e) {
	System.out.println(e);
	System.out.println("here you got number forat Exception");
}
	}

}
