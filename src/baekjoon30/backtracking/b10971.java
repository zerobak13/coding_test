package baekjoon30.backtracking;

import java.util.Scanner;

public class b10971 {
    static int[][]w;
    static boolean[] visited;
    static int N;
    static int result=Integer.MAX_VALUE;
    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();
        w=new int[N][N];
        visited=new boolean[N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                w[i][j]=sc.nextInt();
            }
        }
        visited[0]=true;
        dfs(0,0,0,1);
        System.out.println(result);
    }

    static void dfs(int start,int curr, int cost, int depth){
        if(depth==N){
            if(w[curr][start]!=0){
                result=Math.min(result,cost+w[curr][start]);
            }
            return;
        }
        for(int i=0;i<N;i++){
            if(w[curr][i]!=0&&!visited[i]){
                visited[i]=true;
                dfs(start, i,cost+w[curr][i],depth+1);
                visited[i]=false;
            }

        }
    }
}
