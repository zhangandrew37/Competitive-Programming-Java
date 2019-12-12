
import java.util.*;

public class ccc14j3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int countA = 100;
		int countB = 100;


		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a>b) {
				countB -= a;
			} else if(b>a) {
				countA -=b;
			}
		}
		System.out.println(countA);
		System.out.println(countB);
	}
}
