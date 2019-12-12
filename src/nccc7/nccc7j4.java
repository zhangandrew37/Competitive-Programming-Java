
import java.util.*;

public class nccc7j4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S1 = sc.next();
		int [] A1 = new int [26];
		String S2 = sc.next();
		int [] A2 = new int [26];
		int count = 0;
		//ASCII
		for(int i=0; i<S1.length();i++) {
			A1[S1.charAt(i)-'A']++; //ASCII # - 65
		}
		for(int i=0; i<S2.length();i++) {
			A2[S2.charAt(i)-'A']++; //ASCII # - 65
		}
		
		for(int i=0; i<26; i++) {
		if(A1[i]>A2[i]) {
			count += A1[i] - A2[i];
		}
		}
		System.out.println(count);
	}

}
