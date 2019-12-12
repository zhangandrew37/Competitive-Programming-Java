
import java.util.*;

public class ccc05s2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int x = 0;
		int y = 0;
		while (true) {
			//input moves
			int xMove = sc.nextInt();
			int yMove = sc.nextInt();
			if (xMove==0 && yMove==0){
				break;
			}
			x += xMove;
			y += yMove;
			if (x<0) {
				x = 0;
			} else if (x>X) {
				x = X;
			}
			if (y<0) {
				y = 0;
			} else if (y>Y) {
				y = Y;
			}
			System.out.println(x+" "+y);
		}
	}
}