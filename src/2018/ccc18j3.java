
import java.util.*;

public class ccc18j3 {

	public static void main(String[] args) {
		//https://dmoj.ca/problem/ccc18j3
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int distance1 = sc.nextInt();
		int distance2 = sc.nextInt();
		int distance3 = sc.nextInt();
		int distance4 = sc.nextInt();
		
		System.out.println("0 " + distance1 + " " + (distance1+distance2) + " " + (distance1+distance2+distance3) + " " + (distance1+distance2+distance3+distance4));
		System.out.println(distance1 + " 0 " + distance2 + " " + (distance2 + distance3) + " " + (distance2 + distance3 + distance4));
		System.out.println((distance1+distance2) + " " + distance2 + " 0 " + distance3 + " " + (distance3 + distance4));
		System.out.println((distance1+distance2+distance3) + " " + (distance2 + distance3) + " " + distance3 + " 0 " + distance4);
		System.out.println((distance1+distance2+distance3+distance4) + " " + (distance2 + distance3 + distance4) + " " + (distance3 + distance4) + " " +  distance4 + " 0");
	}
}
