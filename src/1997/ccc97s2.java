import java.io.*;
import java.util.*;

public class ccc97s2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++){
			int N = sc.nextInt();
			boolean b = false;

			for (int j = 1; j <= N; j++){
				if (N % j == 0){
					for (int k = 1; k <= N; k++){
						if (N % k == 0){
							if ((N / k) - k == (N / j) + j){
								b = true;
							}
						}
					}
				}
			}

			if (b){
				System.out.println(N + " is nasty");
			} else {
				System.out.println(N + " is not nasty");
			}

		}
	}
}
