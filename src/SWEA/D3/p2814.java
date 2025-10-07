package SWEA.D3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p2814 {
    static List<Integer>[]graph;
    static boolean[]visited;
    static int max_length;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int N=sc.nextInt();
            int M=sc.nextInt();
            graph= new ArrayList[N+1];
            visited=new boolean[N+1];
            max_length=0;
            for(int i=1;i<=N;i++){
                graph[i]=new ArrayList<>();
            }
            for(int i=0;i<M;i++){
                int x=sc.nextInt();
                int y=sc.nextInt();
                graph[x].add(y);
                graph[y].add(x);
            }
            for(int i=1;i<=N;i++) {
                dfs(i, 1);
            }
            System.out.println("#"+tc+" "+max_length);

        }

    }
    static void dfs(int v, int length){
        if(visited[v]){
            return;
        }
        max_length=Math.max(max_length,length);
        visited[v]=true;
        for(int i=0;i<graph[v].size();i++){
            dfs(graph[v].get(i),length+1);
        }
        visited[v]=false;

    }
}
