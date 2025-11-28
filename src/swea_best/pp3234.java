package swea_best;

import java.util.Scanner;

public class pp3234 {
    static int N;
    static int[]weight;
    static boolean[]visited;

    static int count;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            N=sc.nextInt();
            count=0;
            weight=new int[N];
            visited=new boolean[N];
            for(int i=0;i<N;i++){
                weight[i]=sc.nextInt();
            }
            dfs(0,0,0);
            System.out.println("#"+tc+" "+count);
        }

    }
    static void dfs(int left, int right, int depth){
        if(depth==N){
            count++;
            return;
        }
        for(int i=0;i<N;i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(left + weight[i], right, depth + 1);
                if (left >= weight[i] + right) {
                    dfs(left, right + weight[i], depth + 1);
                }
                visited[i] = false;
            }
        }
    }
}
