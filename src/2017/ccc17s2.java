
import java.util.*;

public class ccc17s2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int [] m = new int [n];
		for(int i=0; i<n; i++){
			m[i] = sc.nextInt();
		}
		Arrays.sort(m);

		if(n%2==0){
			int [] low = new int [n/2];
			int [] high = new int [n/2];

			for(int i=0; i<n/2; i++){
				low [i] = m[i];
				high[i] = m[n/2+i];
			}
			for(int i=0; i<(n/2); i++){
				System.out.print(low[n/2-i-1] + " " + high[i] + " ");
			}

		} else {
			int [] low = new int [(n-1)/2];
			int [] high = new int [(n-1)/2];

			for(int i=1; i<(n-1)/2+1;i++){
				low [i-1] = m[i];
				high[i-1] = m[(n-1)/2+i];
			}
			for(int i=0; i<(n/2); i++){
				System.out.print(low[n/2-i-1] + " " + high[i] + " ");
			}
			System.out.print(m[0]);
		}
	}
}
