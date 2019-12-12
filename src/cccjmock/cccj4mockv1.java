
import java.util.*;

public class cccj4mockv1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] count = new int [4];
		count[0] = 3; //Deluxe Tuna blitz
		count[1] = 2; //Bonito Bitz
		count[2] = 1; //Sashimi
		count[3] = 0; //Ritzy Bitz
		
		int n = sc.nextInt();
		String S;
		for(int i=0; i<=n; i++) {
			S = sc.nextLine();
			if(S.equals("Deluxe Tuna Blitz")) {
				count [0]+=10;
			} else if(S.equals("Bonito Bitz")) {
				count [1]+=10;
			} else if(S.equals("Sashimi")) {
				count [2]+=10;
			} else if(S.equals("Ritzy Bitz")) {
				count [3]+=10;
			} 
		}
		Arrays.sort(count);
		for(int i=3; i>=0; i--) {
		int amount = count[i]/10;
		int orderID = count[i]-amount*10;
		
		if(amount!=0) {
			if(orderID==3) {
				System.out.println("Deluxe Tuna Blitz " + amount);
			} else if(orderID==2) {
				System.out.println("Bonito Bitz " + amount);
			} else if(orderID==1) {
				System.out.println("Sashimi " + amount);
			} else if(orderID==0) {
				System.out.println("Ritzy Bitz " + amount);
			}
		}
		}
	}
}
