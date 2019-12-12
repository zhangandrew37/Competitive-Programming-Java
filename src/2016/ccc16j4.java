
import java.util.*;
public class ccc16j4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] A = S.split(":");
		int H = Integer.parseInt(A[0]);
		int M = Integer.parseInt(A[1]);

		for(int i=0; i<120; i++) {
			if((H>=7 && H<10)||(H>=15 && H<19)) {
				M+=2;
			} else {
				M++;
			}
			if(M>=60) {
				M-=60;
				H++;
			} 
			if(H>23) {
				H-=24;
			}
		}
		System.out.printf("%02d:%02d",H,M);
	}
}
