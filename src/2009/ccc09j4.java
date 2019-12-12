
import java.util.*;
public class ccc09j4 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);	
		int w = sc.nextInt();
		//	Sting S = "WELCOME TO CCC GOOD LUCK TODAY";
		//  String [] A = S.split(" "):

		String [] A = {"WELCOME", "TO", "CCC", "GOOD", "LUCK", "TODAY"};

		//  String [] A = new String [6];
		// 	A[0] = "WELCOME";

		LinkedList <String> currentLine = new LinkedList <String>();
		int total = 0;
		for(int i=0; i<A.length; i++) {
			if (total==0) {
				currentLine.add(A[i]);
				total = A[i].length();
			} else if(total + A[i].length() + 1<=w) {
				currentLine.add(A[i]);
				total = total + A[i]. length() +1;
			} else {
				print(currentLine, w);
				currentLine = new LinkedList<String>();
				currentLine.add(A[i]);
				total = A[i].length();
			}
			if(i==A.length-1) {
				print(currentLine, w);
			}
		}

	}

	private static void print(LinkedList<String> l, int w) {
		// TODO Auto-generated method stub
		int size = l.size();
		if(size==1) {
			System.out.print(l.get(0));
		}
	}
}
