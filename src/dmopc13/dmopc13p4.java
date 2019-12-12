import java.util.*;
public class dmopc13p4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int l = sc.nextInt();
            int w = sc.nextInt();
            char[][] room = new char[w][l];

            int rowStart = 0, colStart = 0, rowEnd = 0, colEnd = 0;

            for (int width = 0; width < w; width++) {
                room[width] = sc.next().toCharArray();
            }

            int step[][] = new int[w][l];
            for (int j = 0; j < w; j++) {
                Arrays.fill(step[j], Integer.MAX_VALUE);
            }

            for (int width = 0; width < w; width++) {
                for (int length = 0; length < l; length++) {
                    if (room[width][length] == 'C') {
                        rowStart = width;
                        colStart = length;
                    }
                    if (room[width][length] == 'W') {
                        rowEnd = width;
                        colEnd = length;
                    }
                    if (room[width][length] == 'X') {
                        step[width][length] = -1;
                    }
                }
            }
            LinkedList<Integer> rowQueue = new LinkedList<Integer>();
            LinkedList<Integer> colQueue = new LinkedList<Integer>();
            rowQueue.add(rowStart);
            colQueue.add(colStart);

            step[rowStart][colStart] = 0;
            while (!rowQueue.isEmpty()) {
                int r = rowQueue.poll();
                int c = colQueue.poll();
                //top
                if (r - 1 >= 0 && step[r - 1][c] > step[r][c] + 1) {
                    rowQueue.add(r - 1);
                    colQueue.add(c);
                    step[r - 1][c] = step[r][c] + 1;
                }
                //bot
                if (r + 1 < w && step[r + 1][c] > step[r][c] + 1) {
                    rowQueue.add(r + 1);
                    colQueue.add(c);
                    step[r + 1][c] = step[r][c] + 1;
                }

                //right
                if (c + 1 < l && step[r][c + 1] > step[r][c] + 1) {
                    rowQueue.add(r);
                    colQueue.add(c + 1);
                    step[r][c + 1] = step[r][c] + 1;
                }

                //left
                if (c - 1 >= 0 && step[r][c - 1] > step[r][c] + 1) {
                    rowQueue.add(r);
                    colQueue.add(c - 1);
                    step[r][c - 1] = step[r][c] + 1;
                }
            }
            if (step[rowEnd][colEnd] >= 60 ) {
                System.out.println("#notworth");
            } else {
                System.out.println(step[rowEnd][colEnd]);

            }
            }
        }
    }