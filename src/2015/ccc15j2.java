
import java.util.*;

public class ccc15j2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		int countH = 0;
		int countS = 0;

		char c [] = S.toCharArray();

		for(int i=0; i<S.length(); i++) {
			if(c[i]==':' && c[i+1]=='-') {
				if(c[i + 2] == ')') {
					countH++;
				}
				else if(c[i + 2] == '(') {
					countS++;
				}
			}
		}
		if(countH>countS) {
			System.out.println("happy");
		} else if(countS>countH) {
			System.out.println("sad");
		} else if(countS==countH && countS>0) {
			System.out.println("unsure");
		} else if(countS==0 && countH==0) {
			System.out.println("none");
		}
	}
}
