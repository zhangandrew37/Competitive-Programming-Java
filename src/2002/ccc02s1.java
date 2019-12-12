import java.io.*;
import java.util.*;

public class ccc02s1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pink = sc.nextInt();
		int green = sc.nextInt();
		int red = sc.nextInt();
		int orange = sc.nextInt();
		int total = sc.nextInt();
		int count=0;
		int min = 100000;

		for(int p=0;p<=total;p++) {
			for(int g=0;g<=total;g++) {
				for(int r=0;r<=total;r++) {
					for( int o=0;o<=total;o++) {
						if(p*pink+g*green+r*red+o*orange==total){
							System.out.print("# of PINK is "+p);
							System.out.print(" # of GREEN is "+g);
							System.out.print(" # of RED is "+r);
							System.out.println(" # of ORANGE is "+o);
							if(min>(p+g+r+o)){
								min = p+g+r+o;
							}
							count++;
						}
					}
				}
			}
		}
		System.out.println("Total combinations is "+count+".");
		System.out.println("Minimum number of tickets to print is "+min+".");
	}
}
