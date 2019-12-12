
import java.util.*;

public class ccc14j2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String C = sc.nextLine();
		String S = sc.nextLine();
		int countA = 0;
		int countB = 0;

		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i)=='A') {
				countA++;
			} else if (S.charAt(i)=='B') {
				countB++;
			}

		}
		if(countA>countB) {
			System.out.println("A");
		}else if(countB>countA) {
			System.out.println("B");
		} else if(countA==countB) {
			System.out.println("Tie");
		}
	}
}
