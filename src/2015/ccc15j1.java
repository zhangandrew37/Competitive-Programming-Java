
import java.util.*;

public class ccc15j1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a==2 && b==18) {
			System.out.println("Special");
		} else if((a==2 && b>18) || a>2) {
			System.out.println("After");
		} else if(a==2 && b<18 || a<2){
			System.out.println("Before");

		}
	}
}
