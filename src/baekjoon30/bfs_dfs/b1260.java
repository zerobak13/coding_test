package baekjoon30.bfs_dfs;

import java.util.*;

public class b1260 {
    static List<Integer>[]graph;
    static boolean[]visited;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int V=sc.nextInt();
        graph=new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<M;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        for(int i=1;i<=N;i++){
            Collections.sort(graph[i]);
        }
        visited=new boolean[N+1];
        dfs(V);
        System.out.println();
        visited=new boolean[N+1];
        bfs(V);

    }
    static void dfs(int v){
        if(!visited[v]) {
            visited[v] = true;
            System.out.print(v+" ");
            for(int x:graph[v]){
                dfs(x);
            }
        }

    }

    static void bfs(int v){
        Queue<Integer>q=new LinkedList<>();
        visited[v]=true;
        q.add(v);
        while(!q.isEmpty()){
            int curr=q.poll();
            System.out.print(curr+" ");
            for(int x:graph[curr]){
                if(!visited[x]) {
                    visited[x]=true;
                    q.add(x);
                }
            }
        }

    }
}
