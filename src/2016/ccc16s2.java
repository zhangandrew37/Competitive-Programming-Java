
import java.util.*;

public class ccc16s2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		int question = sc.nextInt();
		int N = sc.nextInt();

		int [] Dmoj = new int [N];
		int [] Peg = new int [N];

		for(int i=0; i<N; i++) {
			Dmoj [i] = sc.nextInt();

		}
		for(int i=0; i<N; i++) {
			Peg [i] = sc.nextInt();
		}
		Arrays.sort(Dmoj);
		Arrays.sort(Peg);

		int total=0;
		if(question ==1) {
			for(int i=0; i<N; i++) {
				total += max(Dmoj[i],Peg[i]);
			}
		} 

		else {
			for(int i=0; i<N; i++) {
				total += max(Dmoj[i],Peg[N-i-1]);
			}
		}
		System.out.println(total);
	}

	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		if(i>j) {
			return i;
		} else {
			return j;
		}
	}
}
