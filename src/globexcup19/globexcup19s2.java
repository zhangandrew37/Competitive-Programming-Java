import java.util.*;
public class globexcup19s2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int [] one = new int [6];
        int [] two = new int [6];
        double [] soln = new double [6];

        int N = sc.nextInt();
        for(int i=N; i>=0; --i){
            one [i] = sc.nextInt();
        }

        int M = sc.nextInt();
        for(int i=M; i>=0; --i){
            two [i] = sc.nextInt();
        }

        for(int i=0; i<6; i++){
            soln[i] = one[i] - two[i];
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        double answer =((Math.sqrt(Math.pow(soln[1],2)-(4*soln[0]*soln[2]))-soln[1])/2); //edit this
        double final2 =(-soln[1] + Math.sqrt(Math.pow(soln[1],2)-(4*soln[0]*soln[2])))/2; //edit this
        double ans = 0;

        if(answer >= a && answer <=b) ans = answer;
        else ans = final2;

        if(soln[2]!=0) System.out.println(ans);
        else System.out.println(-soln[0]/soln[1]);
    }
}