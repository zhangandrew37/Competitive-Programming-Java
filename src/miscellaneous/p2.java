import java.util.*;
public class p2 {
    static long factorial(int n){
        if (n == 0 || n == 1)
            return 1;
        else
            return(n * factorial(n-1));
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String S = sc.next();
        int[] count = new int[26];
        int starCount = 0;
        long permutations = factorial(n);
        int subtract = 0;
        for (int i = 0; i < S.length(); i++) {
            int temp = Character.getNumericValue(S.charAt(i)) - Character.getNumericValue('a');
            if (S.charAt(i) == '*') {
                starCount++;
            } else {
                count[temp]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            permutations /= factorial(count[i]);
            if(count[i]>0){
                subtract += factorial(count[i]);
            }
        }
        if (starCount == 1) {
            System.out.println(permutations * 26 -subtract);
        } else{
            System.out.println(permutations);
        }
    }
}
