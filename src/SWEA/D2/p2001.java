package SWEA.D2;

import java.util.Scanner;

public class p2001 {
    static int [][]arr;
    static int N;
    static int M;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=0;tc<T;tc++) {


            N = sc.nextInt();
            M = sc.nextInt();

            arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    max = Math.max(max, part_sum(i, j));
                }
            }
            System.out.println("#"+(tc+1)+" "+max);
        }

    }
    static int part_sum(int i,int j){
        int sum=0;
        if(i+(M-1)<N&&j+(M-1)<N) {
            for (int k = 0; k < M; k++) {
                for(int x=0;x<M;x++){
                    sum+=arr[i+k][j+x];
                }

            }
        }
        return sum;
    }

}
