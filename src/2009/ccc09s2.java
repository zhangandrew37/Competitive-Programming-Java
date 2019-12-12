
import java.util.*;

public class ccc09s2 {
	public static void maain(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		String S1 = "1010";
		String S2 = "0011";
		System.out.println(combine(S1,S2));
		
	}
	
	public static String combine (String S1, String S2) {
		String S = "";
		for(int i=0; i<S1.length(); i++) {
			if(S1.charAt(i)==S2.charAt(i)) {
				S+="0";
			} else {
				S+="1";
			}
		}
		return S;
	}
}
