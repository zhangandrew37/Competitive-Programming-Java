
import java.util.*;

public class ccc19j3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;
		for(int i=0; i<n; i++) {
			String S = sc.next() + " ";

			for(int j=0; j<S.length()-1; j++) {
				count++;
				if(S.charAt(j)!=S.charAt(j+1)){
					System.out.print(count + " " + S.charAt(j) + " ");
					count=0;
				}

			} 
			System.out.println();
		}
	}
}
