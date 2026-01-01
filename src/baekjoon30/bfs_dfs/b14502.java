package baekjoon30.bfs_dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b14502 {
    static int N;
    static int M;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int result=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        dfs(0);
        System.out.println(result);
    }

    static void dfs(int wall) {
        if (wall == 3) {
            bfs();
            return;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j]==0){
                    map[i][j]=1;
                    dfs(wall+1);
                    map[i][j]=0;
                }
            }
        }
    }

    static void bfs(){
        int[][]copy=new int[N][M];
        Queue<int[]>q=new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                copy[i][j]=map[i][j];
                if(copy[i][j]==2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int[]curr=q.poll();
            int x=curr[0];
            int y=curr[1];
            for(int i=0;i<4;i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                if(nx>=0&&ny>=0&&nx<N&&ny<M){
                    if(copy[nx][ny]==0){
                        q.offer(new int[]{nx,ny});
                        copy[nx][ny]=2;
                    }
                }
            }
        }
        int area=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(copy[i][j]==0){
                    area++;
                }
            }
        }
        result=Math.max(result,area);

    }
}
