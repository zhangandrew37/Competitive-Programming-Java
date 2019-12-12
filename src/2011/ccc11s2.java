
import java.util.*;

public class ccc11s2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		char[] student = new char [n];
		char[] correct = new char [n];
		int count = 0;
		for(int i=0; i<n; i++) {
			student[i] = sc.next().charAt(0);
		}
		for(int i=0; i<n; i++) {
			correct[i] = sc.next().charAt(0);
		}
		for(int i=0; i<n; i++) {
			if (student[i]==correct[i]) {
				count++;
			}
		}
		System.out.print(count);

	}
}
