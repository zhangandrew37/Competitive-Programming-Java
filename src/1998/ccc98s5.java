import java.util.*;

public class ccc98s5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trips = sc.nextInt();
        for (int i = 0; i < trips; i++) {
            int n = sc.nextInt();
            int[][] terrain = new int[n][n];
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    terrain[row][col] = sc.nextInt();
                }
            }
            int oxyStart = terrain[0][0];

            LinkedList<Integer> rowQueue = new LinkedList<Integer>();
            LinkedList<Integer> colQueue = new LinkedList<Integer>();
            rowQueue.add(0);
            colQueue.add(0);
            int[][] step = new int[n][n];
            for (int s = 0; s < n; s++) {
                Arrays.fill(step[s], Integer.MAX_VALUE);
            }
            step[0][0] = 0;

            boolean[][] visited = new boolean[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    visited[j][k] = false;
                }
            }

            while (!rowQueue.isEmpty()) {
                int r = rowQueue.poll();
                int c = colQueue.poll();

                //top
                if (r - 1 >= 0 && !visited[r - 1][c] && Math.abs(terrain[r - 1][c] - terrain[r][c]) <= 2) {
                    visited[r - 1][c] = true;
                    if (terrain[r - 1][c] > oxyStart || terrain[r][c] > oxyStart) {
                        step[r - 1][c] = step[r][c] + 1;
                    } else {
                        step[r - 1][c] = step[r][c];
                    }
                    rowQueue.add(r - 1);
                    colQueue.add(c);
                }
                //bot
                if (r + 1 < n && !visited[r + 1][c] && Math.abs(terrain[r + 1][c] - terrain[r][c]) <= 2) {
                    visited[r + 1][c] = true;
                    if (terrain[r + 1][c] > oxyStart || terrain[r][c] > oxyStart) {
                        step[r + 1][c] = step[r][c] + 1;
                    } else {
                        step[r + 1][c] = step[r][c];
                    }
                    rowQueue.add(r + 1);
                    colQueue.add(c);
                }
                //left
                if (c - 1 >= 0 && !visited[r][c - 1] && Math.abs(terrain[r][c - 1] - terrain[r][c]) <= 2) {
                    visited[r][c - 1] = true;
                    if (terrain[r][c - 1] > oxyStart || terrain[r][c] > oxyStart) {
                        step[r][c - 1] = step[r][c] + 1;
                    } else {
                        step[r][c - 1] = step[r][c];
                    }
                    rowQueue.add(r);
                    colQueue.add(c - 1);
                }
                //right
                if (c + 1 < n && !visited[r][c + 1] && Math.abs(terrain[r][c + 1] - terrain[r][c]) <= 2) {
                    visited[r][c + 1] = true;
                    if (terrain[r][c + 1] > oxyStart || terrain[r][c] > oxyStart) {
                        step[r][c + 1] = step[r][c] + 1;
                    } else {
                        step[r][c + 1] = step[r][c];
                    }
                    rowQueue.add(r);
                    colQueue.add(c + 1);
                }

            }

            if (step[n - 1][n - 1] == Integer.MAX_VALUE) {
                System.out.println("CANNOT MAKE THE TRIP");
            } else {
                System.out.println(step[n - 1][n - 1]);
            }

        }
    }
}
