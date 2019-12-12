import java.util.*;
public class ccc08s1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> city = new ArrayList<String>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        while(sc.hasNext()) {
            String S = sc.next();
            int t = sc.nextInt();
            city.add(S);
            temp.add(t);
            if (S.equals("Waterloo")) {
                break;
            }
        }

        int lowestIndex = 0;

        for (int i = 0; i < temp.size(); i++){
            if (temp.get(i) < temp.get(lowestIndex)){
                lowestIndex = i;
            }
        }
        System.out.println(city.get(lowestIndex));
    }
}

