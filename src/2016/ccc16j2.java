
import java.util.*;

public class ccc16j2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int g = sc.nextInt();
		int h = sc.nextInt();
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		int o = sc.nextInt();
		int p = sc.nextInt();

		if((a+b+c+d) == (e+f+g+h) && (a+b+c+d) == (i+j+k+l)&& (a+b+c+d) == (m+n+o+p)
				&& (a+e+i+m) == (a+b+c+d) && (a+b+c+d) == (b+f+j+n) && (a+b+c+d) == (c+g+k+o) && (a+b+c+d) == (d+h+l+p)) {
			System.out.println("magic");
		} else {
			System.out.println("not magic");
		}

	}

}
