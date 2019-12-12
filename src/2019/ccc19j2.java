
import java.util.*;

public class ccc19j2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			char c = sc.next().charAt(0);
			for(int j=0; j<a; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
		
	}
}
