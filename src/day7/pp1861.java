package day7;

import java.util.Scanner;

public class pp1861 {
    static int[][]room;
    static int[][]dp;
    static int[]dx={-1,1,0,0};
    static int[]dy={0,0,-1,1};
    static int N;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            N=sc.nextInt();
            room=new int[N][N];
            dp=new int[N][N];
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    room[i][j]=sc.nextInt();
                }
            }
            int max_len=0;
            int room_num=0;
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    int len=dfs(i,j);
                    if(len>max_len){
                        max_len=len;
                        room_num=room[i][j];
                    }
                    else if(len==max_len){
                        if(room[i][j]<room_num){
                            room_num=room[i][j];
                        }
                    }
                }
            }
            System.out.println("#"+tc+" "+room_num+" "+max_len);

        }
    }
    static int dfs(int x, int y){

        if(dp[x][y]!=0){
            return dp[x][y];
        }
        dp[x][y]=1;
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0&&nx<N&&ny>=0&&ny<N&&room[nx][ny]==room[x][y]+1){
                dp[x][y]=1+dfs(nx,ny);
                break;
            }
        }

        return dp[x][y];
    }

}
