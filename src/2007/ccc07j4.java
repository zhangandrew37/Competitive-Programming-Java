import java.util.*;

public class ccc07j4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String inputOne = sc.nextLine();
        String inputTwo = sc.nextLine();

        String one = inputOne.replaceAll(" ", "");
        String two = inputTwo.replaceAll(" ", "");

        char [] a = new char [one.length()];
        char [] b = new char [two.length()];

        for(int i=0; i<one.length(); i++){
            a [i] = one.charAt(i);
        }

        for(int i=0; i<two.length(); i++){
            b [i] = two.charAt(i);

        }

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b)){
            System.out.println("Is an anagram.");
        } else{
            System.out.println("Is not an anagram.");
        }
    }
}
