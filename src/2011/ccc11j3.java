
import java.util.*;

public class ccc11j3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 1;
		for(int i=0; i<10000; i++) {
			int c = a-b;
			a = b;
			b = c;
			count++;
			if(c<0) {
				break;
			}

		}
		System.out.println(count);
	}
}