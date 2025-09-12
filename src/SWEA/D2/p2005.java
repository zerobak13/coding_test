package SWEA.D2;

import java.util.Scanner;

public class p2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int[][]pascal=new int[N][N];
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    pascal[i][0]=1;
                    pascal[i][i]=1;
                }
            }
            for(int i=2;i<N;i++) {
                for (int j = 1; j < i; j++) {
                    pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
                }
            }
            System.out.println("#"+tc);
            for(int i=0;i<N;i++){
                for(int j=0;j<=i;j++){
                    System.out.print(pascal[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
