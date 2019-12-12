import java.util.*;
public class p1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] positive = new int[100001];
        int[] negative = new int[100001];

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if (num >= 0){
                positive[num] += 1;
            } else{
                negative[Math.abs(num)] += 1;
            }
        }

        int maxOccurence = Integer.MIN_VALUE;
        for (int i = 0; i < 100001; i++){
            if (positive[i] > maxOccurence){
                maxOccurence = positive[i];
            }
            if (negative[i] > maxOccurence){
                maxOccurence = negative[i];
            }
        }

        for (int i = 100000; i >= 0; i--){
            if (maxOccurence == negative[i]){
                System.out.print(-i + " ");
            }
        }

        for (int i = 0; i < 100001; i++){
            if (maxOccurence == positive[i]){
                System.out.print(i + " ");
            }
        }
    }
}
