package baekjoon30.DP;

import java.util.Scanner;

public class b9095 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++) {
            int num=sc.nextInt();
            int[] dp = new int[12];
            dp[0]=0;
            dp[1]=1;
            dp[2]=2;
            dp[3]=4;
            for(int j=4;j<=11;j++){
                dp[j]=dp[j-1]+dp[j-2]+dp[j-3];
            }
            System.out.println(dp[num]);
        }

    }
}
