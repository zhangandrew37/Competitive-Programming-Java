
import java.util.*;
public class ccc17s3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		int [] wood = new int [2001];
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			int L = sc.nextInt();
			wood[L]++;
		}

		int [] fence = new int [4001];

		for(int H1=1; H1<=2000; H1++) { //first wood length
			for(int H2=1; H2<=2000; H2++) {
				if(H1<=H2) {
					if(H1!=H2) {
						fence[H1+H2]+=Math.min(wood[H1], wood[H2]);
					} else {
						fence[H1+H2]+=wood[H1]/2;
					}
				}
			}
		}
		Arrays.sort(fence);
		int max = fence[4000];

		int count = 0;
		for(int i=0; i<=4000; i++) {
			if(max==fence[i]) {
				count++;
			}
		}
		System.out.println(max+" "+count);
	}
}
