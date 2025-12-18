package baekjoon30.DP;

import java.util.Scanner;

public class b12865 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[]W=new int[N+1];
        int[]V=new int[N+1];
        // dp[i][j] = i번째 물건까지 고려했을 때, 총 무게가 j를 넘지 않도록 담아서 얻을 수 있는 최대 가치
        int[][]dp=new int[N+1][K+1];
        for(int x=1;x<=N;x++){
            W[x]=sc.nextInt();
            V[x]=sc.nextInt();
        }
        for(int i=1;i<=N;i++){
            for(int j=0;j<=K;j++){
                dp[i][j]=dp[i-1][j];
                if(j>=W[i]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - W[i]] + V[i]);
                }
            }
        }
        System.out.println(dp[N][K]);
    }
}
