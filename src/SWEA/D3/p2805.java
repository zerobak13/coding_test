package SWEA.D3;

import java.util.Scanner;

public class p2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int[][] farm = new int[N][N];
            for (int i = 0; i < N; i++) {
                String line=sc.next();
                for (int j = 0; j < line.length(); j++) {
                    farm[i][j] = line.charAt(j)-'0';
                }
            }
            int sum=0;
            int mid=N/2;
            int start=mid;
            for(int i=0;i<N;i++){
                int diff=Math.abs(mid-i);
                start=diff;
                for(int j=start;j<=N-1-diff;j++){
                    sum+=farm[i][j];
                }

            }














//            int start;
//            int x=0;
//            for(int i=0;i<=N/2;i++){
//                start=N/2-i;
//                for(int j=start;j<=start+x;j++){
//                    sum+=farm[i][j];
//                }
//            x+=2;
//            }
//            x=N-3;
//            start=1;
//            for(int i=N/2+1;i<N;i++){
//                for(int j=start;j<=start+x;j++){
//                    sum+=farm[i][j];
//                }
//                start+=1;
//                x-=2;
//            }
            System.out.println("#"+tc+" "+sum);







        }
    }
}