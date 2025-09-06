package SWEA.D2;

import java.util.Scanner;

public class p1961 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int N=sc.nextInt();
            int [][]arr=new int[N][N];
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int[][]arr90=new int[N][N];
            int[][]arr180=new int[N][N];
            int[][]arr270=new int[N][N];
            for(int i=0;i<N;i++) {
                for (int j = 0; j < N; j++) {
                    arr90[j][(N-1)-i]=arr[i][j];
                    arr180[(N-1)-i][(N-1)-j]=arr[i][j];
                    arr270[(N-1)-j][i]=arr[i][j];

                }

            }
            System.out.println("#"+tc);
            for(int i=0;i<N;i++) {
                StringBuilder sb90= new StringBuilder();
                StringBuilder sb180= new StringBuilder();
                StringBuilder sb270= new StringBuilder();
                for (int j = 0; j < N; j++) {
                    sb90.append(arr90[i][j]);
                    sb180.append(arr180[i][j]);
                    sb270.append(arr270[i][j]);


                }

                System.out.println(sb90+" "+sb180+" "+sb270);

            }


        }
    }
}
