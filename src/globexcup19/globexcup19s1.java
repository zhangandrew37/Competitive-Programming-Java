import java.util.*;

public class globexcup19s1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        //Key: planet type, Value: appearances
        HashMap<Integer, Integer> passedPlanets = new HashMap<Integer, Integer>();

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();

            //if hashmap doesn't contain planet type add it
            if(!passedPlanets.containsKey(n)){
                passedPlanets.put(n, 1);
            } else{
                passedPlanets.put(n, passedPlanets.get(n)+1);
            }
            System.out.println(passedPlanets.get(n)-1);
        }
        System.out.println(passedPlanets.size());
    }
}
