
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
	
public class cccj4mock {
	public static class Food implements Comparable<Food>{
		public String name;
		public int amount;
		public int orderID;
		
		public Food(String name, int amount, int orderID) {
			this.name = name;
			this.amount = amount;
			this.orderID = orderID;
		
		}
		
		@Override
		public int compareTo(Food o) {
			if(this.amount>o.amount) {
				return -1;
			} else if(this.amount<o.amount) {
				return 1;
			} else {
				if(this.orderID<o.orderID) {
					return -1;
				} else {
					return 1;
				}
			}
		}
	public static void main(String [] args)throws Exception{
		
		Food[] food = new Food[4];
		food [0] = new Food("Deluxe Tuna Blitz", 0, 0);
		food [1] = new Food("Bonito Bitz", 0, 1);
		food [2] = new Food("Sashimi", 0, 2);
		food [3] = new Food("Ritzy Bitz", 0, 3);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br. readLine());
		
		for(int i=0; i<N; i++) {
			String name = br.readLine();
			if(name.equals("Deluxe Tuna Blitz")) {
				food[0].amount++;
			} else if(name.equals("Bonito Bitz")) {
				food[1].amount++;
			} else if(name.equals("Sashimi")) {
				food[2].amount++;
			} else if(name.equals("Ritzy Bitz")) {
				food[3].amount++;
			}
		}
		Arrays.sort(food);
		
		for(int i=0; i<4; i++) {

		}
	}
		
	}
}
