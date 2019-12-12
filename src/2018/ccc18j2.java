
import java.util.*;
public class ccc18j2 {
	//https://dmoj.ca/problem/ccc18j2
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int V = sc.nextInt();
	char [][] map = new char [2][V];
		String S = sc.next();
		String B = sc.next();
		map[0] = S.toCharArray();
		map[1] = B.toCharArray();

	int count=0;
	for(int row=1; row<2; row++) {
		for(int col=0; col<V; col++) {
			if(map[row-1][col]=='C' && map[row][col]=='C') {
				count++;
			}
		}
		}
	System.out.println(count);
}
	

}
