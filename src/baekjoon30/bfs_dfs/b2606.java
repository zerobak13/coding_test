package baekjoon30.bfs_dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b2606 {
    static boolean visited[];
    static List<Integer>[]graph;
    static int count;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        graph=new ArrayList[N+1];
        visited=new boolean[N+1];
        count=0;
        for(int i=1;i<=N;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<M;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        dfs(1);
        System.out.println(count);


    }
    static void dfs(int v){
        visited[v]=true;
        for(int x:graph[v]){
            if(!visited[x]){
                count++;
                dfs(x);
            }
        }
    }
}
