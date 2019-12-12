import java.util.*;

public class ccc10j5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = 8;
        int colStart = sc.nextInt()-1;
        int rowStart = 8-sc.nextInt();
        int colEnd = sc.nextInt()-1;
        int rowEnd = 8-sc.nextInt();

        LinkedList<Integer> colQueue = new LinkedList<Integer>();
        LinkedList<Integer> rowQueue = new LinkedList<Integer>();
        colQueue.add(colStart);
        rowQueue.add(rowStart);
        int [][] step = new int [N][N];
        for(int i =0; i<N; i++){
            Arrays.fill(step[i], Integer.MAX_VALUE);
        }
        step[rowStart][colStart] = 0;

        while(!rowQueue.isEmpty()){
            int c = colQueue.poll();
            int r = rowQueue.poll();

            //case 1 - 10 oclock
            if(r-1>=0 && c-2>=0 && step[r-1][c-2]>step[r][c]+1){
                rowQueue.add(r-1);
                colQueue.add(c-2);
                step[r-1][c-2] = step[r][c] + 1;
            }
            //case 2 - 11 oclock
            if(r-2>=0 && c-1>=0 && step[r-2][c-1]>step[r][c]+1){
                rowQueue.add(r-2);
                colQueue.add(c-1);
                step[r-2][c-1] = step[r][c] + 1;
            }
            //case 3 - 1 oclock
            if(r-2>=0 && c+1<N && step[r-2][c+1]>step[r][c]+1){
                rowQueue.add(r-2);
                colQueue.add(c+1);
                step[r-2][c+1] = step[r][c] + 1;
            }
            //case 4 - 2 oclock
            if(r-1>=0 && c+2<N && step[r-1][c+2]>step[r][c]+1){
                rowQueue.add(r-1);
                colQueue.add(c+2);
                step[r-1][c+2] = step[r][c] + 1;
            }
            //case 5 - 4 oclock
            if(r+1<N && c+2<N && step[r+1][c+2]>step[r][c]+1){
                rowQueue.add(r+1);
                colQueue.add(c+2);
                step[r+1][c+2] = step[r][c] + 1;
            }
            //case 6 - 5 oclock
            if(r+2<N && c+1<N && step[r+2][c+1]>step[r][c]+1){
                rowQueue.add(r+2);
                colQueue.add(c+1);
                step[r+2][c+1] = step[r][c] + 1;
            }
            //case 7 - 7 oclock
            if(r+2<N && c-1>=0 && step[r+2][c-1]>step[r][c]+1){
                rowQueue.add(r+2);
                colQueue.add(c-1);
                step[r+2][c-1] = step[r][c] + 1;
            }
            //case 8 - 8 oclock
            if(r+1<N && c-2>=0 && step[r+1][c-2]>step[r][c]+1){
                rowQueue.add(r+1);
                colQueue.add(c-2);
                step[r+1][c-2] = step[r][c] + 1;
            }
        }
        System.out.println(step[rowEnd][colEnd]);
    }
}
