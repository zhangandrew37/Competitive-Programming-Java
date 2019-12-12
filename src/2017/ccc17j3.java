
import java.util.*;

public class ccc17j3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int n = sc.nextInt();

		int dis = Math.abs(x1-x2) + Math.abs(y1-y2);

		if(dis<=n && (n-dis)%2==0) {
			System.out.println("Y");

		} else{
			System.out.println("N");
		}

	}
}
