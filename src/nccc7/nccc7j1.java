
import java.util.*;

public class nccc7j1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		char c = sc.next().charAt(0);
		char d = sc.next().charAt(0);
		char e = sc.next().charAt(0);
		
		if(a=='P') {
			count++;
		}
		if(b=='P') {
			count++;
		}
		if(c=='P') {
			count++;
		}
		if(d=='P') {
			count++;
		}
		if(e=='P') {
			count++;
		}
		System.out.println(count);
	}

}
