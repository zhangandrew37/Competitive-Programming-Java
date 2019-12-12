import java.util.*;

public class ccc06s1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dad = sc.next();
        String mom = sc.next();
        char [] dadOne = new char [5];
        char [] dadTwo = new char [5];
        char [] momOne = new char [5];
        char [] momTwo = new char [5];

        for(int i=0; i<5; i++){
            dadOne[i] = dad.charAt(i*2);
            dadTwo[i] = dad.charAt(i*2+1);
        }

        for(int i=0; i<5; i++){
            momOne[i] = mom.charAt(i*2);
            momTwo[i] = mom.charAt(i*2+1);
        }

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            char [] baby = new char [5];
            String babyGenes = sc.next();
            for(int j=0; j<5; j++){
                baby[j] = babyGenes.charAt(j);
            }
            boolean flag = true;
            for(int j=0; j<5; j++){
                if(Character.isUpperCase(baby[j])){
                    if(Character.isUpperCase(dadOne[j]) || Character.isUpperCase(dadTwo[j])||
                        Character.isUpperCase(momOne[j]) || Character.isUpperCase(momOne[j])){
                        int w;
                    } else{
                        flag = false;
                    }
                }
                if(Character.isLowerCase(baby[j])){
                    if((Character.isLowerCase(dadOne[j]) || Character.isLowerCase(dadTwo[j])) &&
                            (Character.isLowerCase(momOne[j]) || Character.isLowerCase(momTwo[j]))){
                        int w;
                    } else{
                        flag = false;
                    }
                }
            }
            if(flag){
                System.out.println("Possible baby.");
            } else{
                System.out.println("Not their baby!");
            }
        }
    }
}
