package SWEA.D3;

import java.util.Scanner;

public class p5789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int N=sc.nextInt();
            int Q=sc.nextInt();
            int[]arr=new int[N+1];
            for(int x=1;x<=Q;x++){
                int i=sc.nextInt();
                int R=sc.nextInt();
                int diff=R-i;
                for(int n=0;n<=diff;n++){
                    arr[i+n]=x;
                }
            }
            System.out.print("#"+tc+" ");
            for(int j=1;j<=N;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }


    }
}
