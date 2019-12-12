
import java.util.*;
public class cccj2mock {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		char [] name = new char [7];
		int sum =0;
		name [0] = 'p';
		name [1] = 'u';
		name [2] = 's';
		name [3] = 'h';
		name [4] = 'e';
		name [5] = 'e';
		name [6] = 'n';
		
		String S = sc.next();
		char one = S.charAt(0);
		char two = S.charAt(1);
		char three = S.charAt(2);
		char four = S.charAt(3);
		char five = S.charAt(4);
		char six = S.charAt(5);
		char seven = S.charAt(6);
		
		if(one!=name[0]) {
			sum++;
		}
		if(two!=name[1]) {
			sum++;
		}
		if(three!=name[2]) {
			sum++;
		}
		if(four!=name[3]) {
			sum++;
		}
		if(five!=name[4]) {
			sum++;
		}
		if(six!=name[5]) {
			sum++;
		}
		if(seven!=name[6]) {
			sum++;
		}
		System.out.println(sum);
	}
}
