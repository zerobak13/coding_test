package SWEA.D2;

import java.util.Scanner;

public class p1954 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        int[]dx={0,1,0,-1};//우,하,좌,상
        int[]dy={1,0,-1,0};
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            int [][]arr=new int[N][N];

            int x=0;
            int y=0;
            int s=0;
            for(int j=1;j<=N*N;j++){
                arr[x][y]=j;
                if(x+dx[s]>=N || x+dx[s]<0 || y+dy[s]>=N || y+dy[s]<0||arr[x+dx[s]][y+dy[s]]!=0){

                    s++;



                }

                s%=4;
                x=x+dx[s];
                y=y+dy[s];

            }
            System.out.println("#"+(i+1));
            for(int r=0;r<N;r++){
                for(int c=0;c<N;c++){
                    System.out.print(arr[r][c]+" ");
                }
                System.out.println();
            }




        }
    }
}
