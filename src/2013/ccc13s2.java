
import java.util.*;

public class ccc13s2 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int N = sc.nextInt();
		int [] train = new int [N];
		for(int i=0; i<N; i++) {
			train[i] = sc.nextInt();
		}
		
		int count = 0;
		int sum = 0;
		for(int i=0; i<N; i++) {
			if(i<4) {
				sum+=train[i];
			}
			else {
				sum+=train[i]-train[i-4];
			}
			if(sum<=max) {
				count++;
			} else {
				break;
			}
		}
		System.out.println(count);
	}
}
