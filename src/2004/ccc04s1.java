import java.util.*;

public class ccc04s1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String skip = sc.nextLine();
		for (int i = 0; i < n; i++) {
			String a = sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			if (a.startsWith(b) || a.startsWith(c) || b.startsWith(c) || b.startsWith(a) || c.startsWith(a) || c.startsWith(b)
					|| a.endsWith(b) || a.endsWith(c) || b.endsWith(c) || b.endsWith(a) || c.endsWith(a) || c.endsWith(b)) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
}
