
import java.util.*;

public class ccc14s2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		String[] one = new String[n];
		String[] two = new String[n];

		for (int i = 0; i < n; i++) {
			one[i] = sc.next();
		}
		for (int i = 0; i < n; i++) {
			two[i] = sc.next();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (one[i].equals(two[j]) && one[j].equals(two[i]) && !one[i].equals(two[i])) {
					count++;
				}
			}
		}
		if (count == n) {
			System.out.println("good");
		} else {
			System.out.println("bad");
		}
	}
}
