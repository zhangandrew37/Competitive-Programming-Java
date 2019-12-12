
import java.util.*;
public class ccc08s3 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			int R = sc.nextInt();
			int C = sc.nextInt();
			char [][] map = new char [R][C];
			for(int r=0; r<R; r++) {
				map[r] = sc.next().toCharArray();
			}

			int step [][] = new int [R][C];
			for(int r=0; r<R; r++) {
				Arrays.fill(step[r], Integer.MAX_VALUE);
			}
			//must use two LinkedLists to represent both row and col positions
			LinkedList<Integer>rowQ = new LinkedList<Integer>();
			LinkedList<Integer>colQ = new LinkedList<Integer>();
			rowQ.add(0);
			colQ.add(0);
			//make sure you check that position is not out of boundary
			while(!rowQ.isEmpty()) {
				int row = rowQ.poll();
				int col = colQ.poll();

				if(map[row][col]=='+'||map[row][col]=='|') {
					if(row-1>=0  ) {

					}
				}
				if(map[row][col]=='+'||map[row][col]=='-') { 
					if(col-1>=0) {

					}
				}
			}
		}
	}

}
