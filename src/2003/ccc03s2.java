import java.io.*;
import java.util.*;

public class ccc03s2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();

		for(int i=0; i<N; i++) {
			String S1 = getLastSyllable(sc.nextLine().toLowerCase());
			String S2 = getLastSyllable(sc.nextLine().toLowerCase());
			String S3 = getLastSyllable(sc.nextLine().toLowerCase());
			String S4 = getLastSyllable(sc.nextLine().toLowerCase());
			if(S1.equals(S2)&& S1.equals(S3)&&S1.equals(S4)) {
				System.out.println("perfect");
			}
			else if(S1.equals(S2) && S3.equals(S4)) {
				System.out.println("even");
			}
			else if (S1.equals(S3) && S2.equals(S4)){
				System.out.println("cross");
			}
			else if(S1.equals(S4) && S2.equals(S3)) {
				System.out.println("shell");
			}
			else {
				System.out.println("free");
			}
		}
	}
	public static String getLastSyllable(String S) {
		String lastS = "";
		for(int i=S.length()-1;i>=0; i--) {
			char c = S.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c==' ') {
				if(c==' ') {
					lastS = S.substring(+1);
				}
				else {
					lastS = S.substring(i);
				}
				lastS = S.substring(i);
				break;
			}
		}
		if(lastS.equals("")){
			lastS = S;
		}
		return lastS;
	}
}
