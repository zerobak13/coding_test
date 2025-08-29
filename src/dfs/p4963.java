package dfs;

import java.util.Scanner;

public class p4963 {
    static int[][]arr;
    static boolean [][] visited;
    static int count=0;
    static int[]dx={-1,1,0,0,-1,-1,1,1};//상하좌우대각선왼쪽위,오른쪽 위, 왼쪽 아래, 오른쪽 아래
    static int[]dy={0,0,-1,1,-1,1,-1,1};
    static int w=0;
    static int h=0;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while(true){
            w=sc.nextInt();
            h=sc.nextInt();
            count=0;
            arr=new int[h][w];
            visited=new boolean[h][w];

            //종료
            if(w==0&&h==0){
                return;
            }
            //입력
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<h;i++) {
                for (int j = 0; j < w; j++) {
                    if(!visited[i][j]&&arr[i][j]==1){
                       dfs(i,j);
                       count++;

                    }
                }
            }


            System.out.println(count);




        }


    }
    static void dfs(int row, int col){
        visited[row][col]=true;
        for(int k=0;k<8;k++) {
            int dx_n = row + dx[k];
            int dy_n = col + dy[k];
            if(dx_n>=0&&dx_n<h&&dy_n>=0&&dy_n<w){
                if(!visited[dx_n][dy_n]&&arr[dx_n][dy_n]==1)
                    dfs(dx_n,dy_n);

            }
        }


    }

}
