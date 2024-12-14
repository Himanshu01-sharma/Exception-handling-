package testException;
import java.util.*;

public class usermadeExveption {

	public static void main(String[] args) {
		System.out.println("enter the age ");
		Scanner sc = new Scanner(System.in);
		int ages = sc.nextInt();
		try {
			vote(ages);
		}
catch(Exception e) {
	System.out.println(e);
}
	}
public static void vote( int ages) throws balak {
	if(ages< 18) {
		throw new balak("user made exception");
	}
	else {
		System.out.println("you are balik");
	}
}
}
class balak extends Exception{
	balak(String message ){
		super(message);
	}
}
