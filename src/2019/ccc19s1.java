
import java.util.*;

public class ccc19s1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char [] C = S.toCharArray();

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		for(int i=0; i<S.length();i++){
			if(C[i]=='V'){
				if(a==1&&b==2&&c==3&&d==4){
					a = 2;
					b = 1;
					c = 4;
					d = 3;
				}
				else if(a==2&&b==1&&c==4&&d==3){
					a = 1;
					b = 2;
					c = 3;
					d = 4;
				}
				else if(a==3&&b==4&&c==1&&d==2){
					a = 4;
					b = 3;
					c = 2;
					d = 1;
				}
				else if(a==4&&b==3&c==2&d==1){
					a = 3;
					b = 4;
					c = 1;
					d = 2;
				}

			} else if(C[i]=='H'){
				if(a==1&&b==2&&c==3&&d==4){
					a = 3;
					b = 4;
					c = 1;
					d = 2;
				}
				else if(a==2&&b==1&&c==4&&d==3){
					a = 4;
					b = 3;
					c = 2;
					d = 1;
				}
				else if(a==3&&b==4&&c==1&&d==2){
					a = 1;
					b = 2;
					c = 3;
					d = 4;
				}
				else if(a==4&&b==3&c==2&d==1){
					a = 2;
					b = 1;
					c = 4;
					d = 3;
				}
			}
		}
		System.out.println(a + " " + b);
		System.out.println(c + " " + d);
	}
}
