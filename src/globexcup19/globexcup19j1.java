import java.util.*;
public class globexcup19j1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int rating = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int [] alien = new int [N];

        for(int i=0; i<N; i++){
            alien [i] = sc.nextInt();
        }

        for(int i=0; i<C; i++){
            if(alien[sc.nextInt()-1] == 1) rating += A;
            else rating -= B;
        }
        System.out.println(rating);
    }
}
