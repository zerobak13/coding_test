package dfs;

import java.util.Scanner;
import java.util.*;

public class p18126 {

    public static class Edge{
        int to;
        long dist;
        Edge(int to,long dist){
            this.to=to;
            this.dist=dist;
        }

    }

    static List<Edge>[]g;
    static boolean []visited;
    static long result=0;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        g=new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            g[i]=new ArrayList<>();
        }

        for(int i=1;i<N;i++){
            int A=sc.nextInt();
            int B=sc.nextInt();
            long C=sc.nextLong();
            g[A].add(new Edge(B,C));
            g[B].add(new Edge(A,C));
        }
        visited=new boolean[N+1];
        dfs(1,0);
        System.out.println(result);

    }

    public static void dfs(int v,long dist){
        visited[v]=true;
        if(dist>result){
            result=dist;
        }
        for(Edge e :g[v]){
            if(!visited[e.to]) {
                dfs(e.to, e.dist + dist);
            }
        }
    }
}
