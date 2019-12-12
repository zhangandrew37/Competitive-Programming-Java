import java.util.*;

public class globexcup18j2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] marks = new int [n];
        int count  = 0;
        double average = 0;

        for(int i=0; i<n; i++) {
            marks[i] = sc.nextInt();
            average += marks[i];
        }
        average /= n;

        for(int i=0; i<n; i++){
            if(marks[i]>average){
                count++;
            }
        }

        if(n%2==0){
            if(count>n/2){
                System.out.println("Winnie should take the risk\n");
            } else{
                System.out.println("That's too risky");
            }
        } else{
            if(count>(n-1)/2){
                System.out.println("Winnie should take the risk\n");
            } else{
                System.out.println("That's too risky");
            }
        }
    }
}
