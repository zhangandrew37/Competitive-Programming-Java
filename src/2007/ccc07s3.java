import java.util.*;
public class ccc07s3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Integer,Integer> friend = new HashMap<Integer,Integer>();
        for(int i=0; i<n; i++){
            int pair1 = sc.nextInt();
            int pair2 = sc.nextInt();
            friend.put(pair1, pair2);
        }

        

        while(sc.hasNext()){
            int one = sc.nextInt();
            int two = sc.nextInt();
            if(one==0 && two==0){
                break;
            }


        }
    }
}
