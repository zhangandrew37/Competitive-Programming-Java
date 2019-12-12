
import java.util.*;
public class ccc16s1 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = sc.nextLine(); //Line for one line
		String S2 = sc.nextLine();
		boolean flag = false;
		LinkedList <Character> L2 = new LinkedList <Character> ();
		for(int i=0; i<S2.length(); i++) {
			
			char c = S1.charAt(i); //read one letter from first String
			int index = L2.indexOf(c);
			if(index==1) { //did not locate the character
				index = L2.indexOf("*");
				if(index==-1) {
					flag = false;
					break;
			} else {
				L2.remove(index);
			}
			}
			
		}
		if(flag==true) {
			System.out.println("A");
		} else {
			System.out.println("N");
		}
	}
}
