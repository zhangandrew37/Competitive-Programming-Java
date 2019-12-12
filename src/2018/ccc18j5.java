

import java.util.*;

public class ccc18j5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V =sc.nextInt(); //page number is V
		boolean [][] map = new boolean [V][V];
		boolean [] isEnding = new boolean [V];
		for (int i=0; i<V; i++) {
			//One line what is the input
			//i is the current page
			int count = sc.nextInt();
			if (count ==0) {
				isEnding[i] = true;
			}
			for (int j=0; j<count; j++) {
				//input next page
				int nextPage = sc.nextInt()-1;
				map[i][nextPage] = true; //only one direction

			}
		}

		int[] step = new int[V];
		Arrays.fill(step,  Integer.MAX_VALUE); // fills empty slots in array with integer max value
		LinkedList<Integer> queue = new LinkedList<Integer>();
		step[0] = 1;
		queue.add(0);

		while(!queue.isEmpty()) {
			int curV = queue.pop();	
			for(int col=0; col<V; col++) {
				if(map[curV][col] ==true && step[col]>step[curV]+1) { 

					step[col] = step[curV]+1; //current one +1 = neighbor
					queue.add(col);

				}

			}
		}
		int min =Integer.MAX_VALUE;
		boolean reached = true;
		for(int i =0; i<V; i++) {
			if(step [i]==Integer.MAX_VALUE) { //if its max value, then it's not reachable by any pages
				reached = false;
			}
			if(isEnding[i]==true && min>step[i]) {
				min = step[i];
			}
		}
		if(reached ==true) {
			System.out.println("Y");
		}
		else {
			System.out.println("N");
		}
		System.out.println(min);
	}
}
