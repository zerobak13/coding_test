package SWEA.D3;

import java.util.Scanner;

public class p3307 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int N=sc.nextInt();
            int[]num=new int[N];
            int[]dp=new int[N];
            for(int i=0;i<N;i++){
                num[i]=sc.nextInt();
            }
            int max=0;
            for(int i=0;i<N;i++){
                dp[i]=1;
                for(int j=0;j<i;j++){
                    if(num[j]<num[i]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
                max=Math.max(max,dp[i]);
            }
            System.out.println("#"+tc+" "+max);

        }
    }
}
