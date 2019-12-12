
import java.util.*;

public class ccc05s1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			String S = sc.next().replace("-", "");
			S = S.replace("A","2");
			S = S.replace("B","2");
			S = S.replace("C","2");
			S = S.replace("D","3");
			S = S.replace("E","3");
			S = S.replace("F","3");
			S = S.replace("G","4");
			S = S.replace("H","4");
			S = S.replace("I","4");
			S = S.replace("J","5");
			S = S.replace("K","5");
			S = S.replace("L","5");
			S = S.replace("M","6");
			S = S.replace("N","6");
			S = S.replace("O","6");
			S = S.replace("P","7");
			S = S.replace("Q","7");
			S = S.replace("R","7");
			S = S.replace("S","7");
			S = S.replace("T","8");
			S = S.replace("U","8");
			S = S.replace("V","8");
			S = S.replace("W","9");
			S = S.replace("X","9");
			S = S.replace("Y","9");
			S = S.replace("Z","9");

			System.out.println(S.substring(0, 3)+"-"+S.substring(3,6)+"-"+S.substring(6,10));
		}
	}
}
