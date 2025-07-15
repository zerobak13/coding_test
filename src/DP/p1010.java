package DP;

import java.util.Scanner;

public class p1010 {
    static long[][]comb = new long[31][31];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init_comb();
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            int M=sc.nextInt();

            System.out.println(comb[M][N]);
        }
        sc.close();
    }

    static void init_comb(){
        for(int n=0;n<31;n++){
            comb[n][n]=1;
            comb[n][0]=1;
            for(int k=1;k<n;k++){
                comb[n][k]=comb[n-1][k-1]+comb[n-1][k];
            }
        }
    }
}
