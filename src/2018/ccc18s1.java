
import java.util.*;
public class ccc18s1 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int [] V = new int [N];

		for(int i=0; i<N; i++) {
			V[i] = sc.nextInt();
		}
		Arrays.sort(V);
		double[] neighbor = new double [N];
		for(int i=0; i<N; i++) {
			if(i==0||i==N-1) {
				neighbor[i] = Integer.MAX_VALUE;
			} else {
				neighbor [i] = (V[i+1] - V[i-1])/2.0;
			}
		}
		Arrays.sort(neighbor);
		System.out.printf("%.1f",neighbor[0]);
	}
}
