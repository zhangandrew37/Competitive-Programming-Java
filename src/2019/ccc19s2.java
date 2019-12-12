
import java.util.*;

public class ccc19s2 {
	static boolean isPrime(int n) { 
		if (n <= 1) 
			return false; 
		for(int i = 2; i <= Math.sqrt(n); i++) 
			if (n % i == 0) 
				return false; 
		return true; 
	} 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			int t = sc.nextInt();
			for(int j=0; j<t; j++){
				if(isPrime(j)&&isPrime(2*t-j)){
					System.out.println(j+" " +(2*t-j));
					break;
				}
			}
		}
	}
}
