
import java.util.*;

public class ccc04s2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] sum = new int[N];
		int[] worstRank = new int[N];

		for (int i=0; i<K; i++) {
			for (int j=0; j<N; j++) {
				sum[j]+=sc.nextInt();
			}

			//find out the rank of each person
			for (int j=0; j<N; j++) { //j is current one
				int rank = 1;
				for (int k=0; k<N; k++) {
					if (sum[k]>sum[j]) {
						rank++;
					}
				}
				if (worstRank[j]<rank) {
					worstRank[j] = rank;
				}
			}
		}

		int max = Integer.MIN_VALUE;
		for (int i=0; i<N; i++) {
			if (sum[i]>max) {
				max = sum[i];
			}
		}
		for (int i=0; i<N; i++) {
			if (sum[i]==max) {
				System.out.println("Yodeller "+(i+1)+
						" is the TopYodeller: score "+
						max+", worst rank "+worstRank[i]);
			}
		}
	}
}
