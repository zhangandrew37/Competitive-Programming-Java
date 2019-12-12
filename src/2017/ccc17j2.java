
import java.util.*;

public class ccc17j2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum=0;
		for(int c=0; c<=b; a*=10, c++) {
			sum += a;
		}
		System.out.println(sum);
	}
}
