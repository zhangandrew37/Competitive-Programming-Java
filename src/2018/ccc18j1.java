
import java.util.*;

public class ccc18j1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		int four = sc.nextInt();
		
		if((one == 8 || one == 9) && two == three && (four == 8 || four == 9)) {
		System.out.println("ignore");
	} else {
		System.out.println("answer");
	}
	}
}
