
import java.util.*;
public class ccc12s2 {
	public static void main(String [] args) {
		//https://dmoj.ca/problem/ccc12s2
		Scanner sc = new Scanner(System.in);

		//key - value I - 1
		//Hash map is like a dictionary
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		//input a String S
		//using a for loop to read char one by one
		//C 100
		
		String S = sc.next();
		int sum =0;
		for(int i=0; i<S.length(); i+=2) {
			//converts a char into an integer (using ASCII symbols)
			int n = S.charAt(i)-'0';
			int value = map.get(S.charAt(i+1));
			int after=0;
			if(i+3<S.length()) {
				after = map.get(S.charAt(i+3));
			}
			if(value<after) {
				sum -= n*value;
			}
			else {
				sum +=n*value;
			}
			
		}
		System.out.print(sum);
	}

}
