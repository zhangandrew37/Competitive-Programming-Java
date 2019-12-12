
import java.util.*;

public class ccc10j4 {
	public static void main(String [] args) {
		
	Scanner sc = new Scanner(System.in);
	while(true) { //control the test case
		int n = sc.nextInt();
		if(n==0) {
			break;
		}
		if(n==1) {
			System.out.print(0);
		}
		int [] A = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
		}
		int [] diff = new int [n-1];
		for(int i=0; i<n-1; i++) {
			diff[i] = A[i+1]-A[i];
		}
		for(int cycle=1; cycle<=n-1; cycle++) {
			boolean flag = true;
			for(int i=0; i<n-1-cycle; i++) {
				if(diff[i]!=diff[i+cycle]) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.println(cycle);
				break;
			}
		}
	}
	
	}
}
