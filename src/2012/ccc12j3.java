package andrew;
import java.util.*;

public class ccc12j3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int j=0; j<n;j++) {
			for(int i=0; i<n; i++) {
				System.out.print("*");
			} 
			for(int i=0; i<n; i++) {
				System.out.print("x");
			}
			for(int i=0; i<n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(int j=0; j<n;j++) {
			for(int i=0; i<n; i++) {
				System.out.print(" ");
			}
			for(int i=0; i<n; i++) {
				System.out.print("xx");
			}
			System.out.println();
		}

		for(int j=0; j<n;j++) {
			for(int i=0; i<n; i++) {
				System.out.print("*");
			}
			for(int i=0; i<n; i++) {
				System.out.print(" ");
			}
			for(int i=0; i<n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
