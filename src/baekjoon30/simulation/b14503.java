package baekjoon30.simulation;

import java.util.Scanner;

public class b14503 {
    static int[][]area;
    static int[]dx={-1,0,1,0};
    static int[]dy={0,1,0,-1};

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int result=0;
        int N=sc.nextInt();
        int M=sc.nextInt();
        area=new int[N][M];
        int r=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                area[i][j]=sc.nextInt();
            }
        }
        while(true) {
            if (area[r][c] == 0) {
                area[r][c] = 2;
                result++;
            }
            boolean check=false;
            for(int i=0;i<4;i++){
                d=(d+3)%4;
                int nr=r+dx[d];
                int nc=c+dy[d];
                if(nr>=0&&nc>=0&&nr<N&&nc<M){
                    if(area[nr][nc]==0){
                        check=true;
                        //area[nr][nc]=2;
                        r=nr;
                        c=nc;
                        //result++;
                        break;
                    }
                }
            }
            if(!check){
                int back=(d+2)%4;
                int xr=r+dx[back];
                int xc=c+dy[back];
                if(area[xr][xc]==1){
                    break;
                }
                if(xr>=0&&xc>=0&&xr<N&&xc<M){
                    r=xr;
                    c=xc;
                }


            }

        }
        System.out.println(result);




    }
}
