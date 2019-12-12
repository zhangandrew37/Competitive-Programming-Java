
import java.util.*;

public class ccc14s3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0;t<T;t++) { 
			int N = sc.nextInt();
			Stack<Integer> top = new Stack <Integer>(); //stack is last in first out (opposite to linkedlist)
			Stack<Integer> side = new Stack<Integer>();
			for(int i=0; i<N; i++) {
				int num = sc.nextInt();
				top.push(num);
			}

			int lake = 0;
			while(!top.isEmpty()) {
				if(lake+1==top.peek()) {
					top.pop();
					lake++;
				} else {
					if(!side.isEmpty()) {
						if(lake+1==side.peek()) {
							side.pop();
							lake++;
						} else {
							side.push(top.pop());
						}
					} else {
						side.push(top.pop());
					}
				} 
			}
			while(!side.isEmpty()) {
				if(lake+1==side.pop()) {
					lake++;
				} else {
					break;
				}
			}
			if(lake==N) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
		}
	}

}
