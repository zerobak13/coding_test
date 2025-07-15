package DP;

import java.util.Scanner;

public class p9655 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();

        boolean[]dp=new boolean[N+1];

        dp[1]=true;
        dp[2]=false;
        dp[3]=true;

        for(int i=4;i<=N;i++){
            dp[i]=!dp[i-1]||!dp[i-3];
        }

        System.out.println(dp[N]?"SK":"CY");
    }
}
