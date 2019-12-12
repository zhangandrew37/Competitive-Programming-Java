
import java.util.*;

public class ccc10s2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String [] key = new String [n]; 
		String [] value = new String [n];

		for(int i=0; i<n; i++) {
			key[i] = sc.next();
			value[i] = sc.next();
		}
		String S = sc.next();
		String map = "";
		//check if S starts with any value
		//appending key into the map String
		while(S.length()!=0) {
			for(int i=0;i<n; i++) {
				if(S.startsWith(value[i])) {
					map = map +key[i];
					//remove value[i] from the beginning of String S
					S = S.substring(value[i].length());
					break;
				}
			}
		}
		System.out.print(map);
	}
}
