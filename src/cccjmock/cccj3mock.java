
import java.util.*;
public class cccj3mock {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			
			int max1 = n/a;
			int max2 = n/b;
			boolean flag = false;
			for(int j=0; j<=max1; j++) {
				for(int k=0; k<=max2; k++) {
					if(j*a+k*b==n) {
						flag = true;
						break;
					}
				}
				if(flag) {
					break;
				}
			}
			
			if(flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
