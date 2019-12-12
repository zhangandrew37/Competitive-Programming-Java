import java.util.*;
public class p0 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int [] sequence = new int [10];
            for(int j=0; j<10; j++){
                sequence [j] = sc.nextInt();
            }

            boolean arithmetic = true;
            boolean geometric = true;

            int difference = sequence[1] - sequence[0];
            double quotient = 0;
            if(sequence[0]!=0){
                quotient = (double) sequence[1]/sequence[0];
            }
            for(int k=2; k<10; k++) {
                //arithmetic
                if(sequence[k]-sequence[k-1]!=difference){
                    arithmetic = false;
                }

                //geometric
                double tempQuotient = 0;
                if(sequence[k-1]!=0){
                    tempQuotient = (double) sequence[k]/sequence[k-1];
                }
                if(quotient!=tempQuotient){
                    geometric = false;
                }
            }

            if (arithmetic && geometric) {
                System.out.println("both");
            } else if (arithmetic) {
                System.out.println("arithmetic");
            } else if (geometric) {
                System.out.println("geometric");
            } else {
                System.out.println("neither");
            }
        }
    }
}
