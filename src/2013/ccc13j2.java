
import java.util.*;

public class ccc13j2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();

		if(S.contains("A")||S.contains("B")||S.contains("C")||S.contains("D")||S.contains("E")||S.contains("F")||S.contains("G")||
				S.contains("J")||S.contains("K")||S.contains("L")||S.contains("M")||S.contains("P")||S.contains("Q")||S.contains("R")||
				S.contains("T")||S.contains("U")||S.contains("V")||S.contains("W")||S.contains("Y")) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
