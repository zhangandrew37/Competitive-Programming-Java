
import java.util.*;

public class ccc12j1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = b-a;

		if(c<=0) {
			System.out.println("Congratulations, you are within the speed limit!");
		} else if(c>0 && c<=20) {
			System.out.println("You are speeding and your fine is $100.");
		} else if(c>20 && c<30) {
			System.out.println("You are speeding and your fine is $270.");
		} else if(c>30) {
			System.out.println("You are speeding and your fine is $500.");
		}
	}
}
