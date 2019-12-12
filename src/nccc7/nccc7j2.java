
import java.util.*;

public class nccc7j2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		char [] c = new char [7];
		c [0] = sc.nextLine().charAt(0);
		if(c[0] == 'J') {
			count++;
		}
		for(int i=1; i<7; i++) {
			c[i] = sc.nextLine().charAt(0);
			if(c[i]=='J'&& c[i-1]!='J') {
				count++;
			} 
		}
		System.out.println(count);
	}

}
