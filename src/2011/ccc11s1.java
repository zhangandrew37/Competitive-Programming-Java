
import java.util.*;

public class ccc11s1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int countT = 0;
		int countS = 0;
		for(int i=0; i<=n; i++) {
			String S = sc.nextLine();
			for(int j=0; j<S.length(); j++) {
				if(S.charAt(j)=='t'||S.charAt(j)=='T') {
					countT++;
				} 
				else if(S.charAt(j)=='s'||S.charAt(j)=='S') {
					countS++;
				}
			}
		}
		if(countT>countS) {
			System.out.println("English");
		} else {
			System.out.println("French");
		}
	}
}
