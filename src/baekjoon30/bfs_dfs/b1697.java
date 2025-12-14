package baekjoon30.bfs_dfs;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b1697 {
    static int time;
    static int K;
    static boolean[] visited;
    static int[]dist;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        K=sc.nextInt();
        visited=new boolean[100001];
        dist=new int[100001];
        bfs(N);
        System.out.println(dist[K]);
    }

    static void bfs(int n){
        Queue<Integer> q=new LinkedList<>();
        q.add(n);
        visited[n]=true;
        while(!q.isEmpty()){
            int curr=q.poll();
            int[]d={curr+1,curr-1,curr*2};
            int np=0;
            for(int i=0;i<3;i++) {
                np = d[i];

                if (np >= 0 && np < 100001 && !visited[np]) {
                    q.add(np);
                    visited[np] = true;
                    dist[np] = dist[curr] + 1;
                    if (np == K) {
                        return;
                    }
                }
            }

        }
    }

}
