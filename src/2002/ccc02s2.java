import java.io.*;
import java.util.*;

public class ccc02s2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int remainder = n-(d*((int)(n/d)));
		int LCM = 0;
		if(((n/d)*d)==n){
			System.out.println(n/d);
		} else if(n==0){
			System.out.println("0");
		} else{
			for(int i=1; i<=remainder; i++){
				if((((remainder/i)*i)==remainder) &&
						(((d/i)*i)==d)){
					LCM = i;
				}
			}
			if(n/d>0){
				System.out.println((n/d) + " " + remainder/LCM + "/" + d/LCM);
			} else{
				System.out.println(remainder/LCM + "/" + d/LCM);
			}
		}
	}
}
