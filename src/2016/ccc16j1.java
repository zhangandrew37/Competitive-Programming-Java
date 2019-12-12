
import java.util.*;

public class ccc16j1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		int total = 0;
		if(sc.next().charAt(0) =='W') {
			total++;
		}
		if(sc.next().charAt(0) =='W') {
			total++;
		}
		if(sc.next().charAt(0) =='W') {
			total++;
		}
		if(sc.next().charAt(0) =='W') {
			total++;
		}
		if(sc.next().charAt(0) =='W') {
			total++;
		}
		if(sc.next().charAt(0) =='W') {
			total++;
		}
		if(total==5||total==6) {
			System.out.println("1");
		} else if(total==3 || total==4) {
			System.out.println("2");
		} else if(total==1 || total==2) {
			System.out.println("3");
		} else if(total ==0) {
			System.out.println("-1");
		}
	}
}