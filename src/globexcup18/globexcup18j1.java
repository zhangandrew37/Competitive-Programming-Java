import java.io.*;
import java.util.*;

public class globexcup18j1 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int countUp = 0;
        int countDown = 0;
        for(int i=0; i<n; i++){
            double x = Double.parseDouble(br.readLine());
            if(Math.round(x)>Math.floor(x)){
                countUp++;
            } else{
                countDown++;
            }
        }
        System.out.println(countUp);
        System.out.println(countDown);
    }

}
