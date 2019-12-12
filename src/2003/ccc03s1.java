import java.io.*;
import java.util.*;

public class ccc03s1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int current = 1;
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n==0){
				System.out.println("You Quit!");
				break;
			}
			if((current+n)<=100){
				current+=n;
			}
			if(current==9){
				current=34;
			} else if(current==40){
				current=64;
			}else if(current==67){
				current=86;
			} else if(current==54){
				current=19;
			} else if(current==90){
				current=48;
			} else if(current==99){
				current=77;
			}
			System.out.println("You are now on square " + current);
			if(current==100){
				System.out.println("You Win!");
			}
		}
	}
}
