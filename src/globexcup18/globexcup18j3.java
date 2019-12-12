import java.util.*;

public class globexcup18j3 {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int count = 0;

    for(int i=0; i<n; i++){
        boolean numPrime = true;
        boolean sumPrime = true;
        int N = sc.nextInt();
        String digits = Integer.toString(N);
        int sum = 0;

        for (char c : digits.toCharArray()) {
            sum += c - '0';
        }

        for(int j=2; j<=Math.sqrt(N); j++){
            if(N % j == 0 ){
                numPrime = false;
                break;
            }
        }

        for(int j=2; j<=Math.sqrt(sum); j++){
            if(sum % j == 0 ){
                sumPrime = false;
                break;
            }
        }

        if(numPrime && sumPrime && N!=1) count++;
    }
        System.out.println(count);
    }
}
