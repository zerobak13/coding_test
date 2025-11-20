package day7;

import java.util.Scanner;

public class pp3307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N=sc.nextInt();
            int[]num=new int[N];
            for(int i=0;i<N;i++){
                num[i]=sc.nextInt();
            }
            int[]dp=new int[N];
            dp[0]=1;
            int result=0;
            for(int i=1;i<N;i++){
                dp[i]=1;
                for(int j=0;j<i;j++) {

                    if (num[j]<num[i]) {
                        dp[i] = Math.max(dp[i],dp[j]+1);
                    }
                }
                result=Math.max(result,dp[i]);

            }
            System.out.println("#"+test_case+" "+result);

        }
    }
}