import java.util.*;
public class vm7wc16_3 {
    static class Graph{
        private int v;
        private LinkedList<Integer> houses[];

        Graph(int v){
            this.v = v;
            houses = new LinkedList[v];
            for(int i=0; i<v; i++){
                houses[i] = new LinkedList<Integer>();
            }
        }

        void addEdge(int x, int y){
            houses[x].add(y);
            houses[y].add(x);
        }

        boolean BFS(int s, int e){
            boolean [] visited = new boolean [v];
            LinkedList<Integer> queue = new LinkedList<Integer>();
            visited[s] = true;
            queue.add(s);

            while(!queue.isEmpty()) {
                s = queue.poll();
                Iterator<Integer> i = houses[s].listIterator();
                while (i.hasNext()){
                    int n = i.next();
                    if(!visited[n]){
                        if(n==e||s==e) return true;
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
            return false;
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A = sc.nextInt()-1;
        int B = sc.nextInt()-1;

        Graph g = new Graph(N);
        for(int i=0; i<M; i++) {
            g.addEdge(sc.nextInt()-1, sc.nextInt()-1 );
        }
        if(g.BFS(A,B)){
            System.out.println("GO SHAHIR!");
        } else{
            System.out.println("NO SHAHIR!");
        }
    }
}
