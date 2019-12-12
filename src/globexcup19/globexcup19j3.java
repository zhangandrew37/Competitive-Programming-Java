import java.util.*;
import java.io.*;
public class globexcup19j3 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        String [] planets = new String [N];
        long [] size = new long [N];

        for(int i=0; i<N; i++){
            StringTokenizer st1 = new StringTokenizer((br.readLine()));
            planets [i] = st1.nextToken();
            size[i] = Long.parseLong(st1.nextToken());
        }

        for(int i=0; i<N-1; i++){
            if(Math.abs(size[i]-size[i+1])<=K){
                planets[i] = "";
                planets[i+1] = "";
            }
        }
        Arrays.sort(planets);
        String output = " ";
        System.out.println(String.join(output, planets).trim());
    }
}
