
import java.util.*;

public class ccc08s2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int count1 = 0;
		for(int i=0; sc.hasNext(); i++) {
			int r = sc.nextInt();

			if(r==0) {
				break;
			}
			
			for(int x = 1; x<=r; x++) {
				for(int y = 0; y<=r; y++) {
					if(((x*x)+(y*y)<=(r*r))&&
							(Math.sqrt((x*x)+(y*y))%1==0)) {
						count++;
					}
					if((y*y)<=(r*r)) {
						count1++;
					}
				}
			}
			System.out.println((count*2)+count1);
		}
	}
}
