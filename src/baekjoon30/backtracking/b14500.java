package baekjoon30.backtracking;

import java.util.Scanner;

public class b14500 {
    static int N;
    static int M;
    static int[][]paper;
    static boolean[][]visited;
    static int []dx={-1,1,0,0};
    static int []dy={0,0,-1,1};
    static int result=Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        paper=new int[N][M];
        visited=new boolean[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                paper[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++) {
                visited[i][j]=true;
                dfs(i,j,paper[i][j], 1);
                visited[i][j]=false;
                checkT(i,j);
            }
        }
        System.out.println(result);

    }
    static void dfs(int x,int y,int sum, int depth){

        if(depth==4){
            result=Math.max(result,sum);
            return;
        }
        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny= y + dy[i];
            if(nx>=0&&ny>=0&&nx<N&&ny<M){
                if(!visited[nx][ny]) {
                    visited[nx][ny]=true;
                    dfs(nx, ny, sum + paper[nx][ny], depth + 1);
                    visited[nx][ny]=false;
                }
            }
        }

    }
    static void checkT(int x,int y){
        int sum=0;
        // ㅗ : 위 + 왼 + 오른
        if (x - 1 >= 0 && y - 1 >= 0 && y + 1 < M) {
            sum = Math.max(sum,
                    paper[x][y]
                            + paper[x - 1][y]
                            + paper[x][y - 1]
                            + paper[x][y + 1]);
        }

        // ㅜ : 아래 + 왼 + 오른
        if (x + 1 < N && y - 1 >= 0 && y + 1 < M) {
            sum = Math.max(sum,
                    paper[x][y]
                            + paper[x + 1][y]
                            + paper[x][y - 1]
                            + paper[x][y + 1]);
        }

        // ㅓ : 왼 + 위 + 아래
        if (y - 1 >= 0 && x - 1 >= 0 && x + 1 < N) {
            sum = Math.max(sum,
                    paper[x][y]
                            + paper[x][y - 1]
                            + paper[x - 1][y]
                            + paper[x + 1][y]);
        }

        // ㅏ : 오른 + 위 + 아래
        if (y + 1 < M && x - 1 >= 0 && x + 1 < N) {
            sum = Math.max(sum,
                    paper[x][y]
                            + paper[x][y + 1]
                            + paper[x - 1][y]
                            + paper[x + 1][y]);
        }
        result=Math.max(result,sum);


    }
}
