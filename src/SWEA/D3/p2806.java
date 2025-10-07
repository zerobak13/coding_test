package SWEA.D3;

import java.util.Scanner;


public class p2806 {
    static int result;
    static int N;
    static int[][]board;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            N=sc.nextInt();
            result=0;
            board=new int[N][N];
            dfs(0);
            System.out.println("#" + tc + " " + result);
        }
    }
    static void dfs(int row){
        if(row==N){
            result++;
            return;
        }
        for(int col=0;col<N;col++){
            if(check(row,col)) {
                board[row][col] = 1;
                dfs(row + 1);
                board[row][col] = 0;
            }

        }
    }
    static boolean check(int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]==1){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0&&j<=N-1;i--,j++){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;

    }
}
