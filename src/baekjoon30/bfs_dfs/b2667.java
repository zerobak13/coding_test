package baekjoon30.bfs_dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class b2667 {
    static int N;
    static int[][]maze;
    static boolean[][]visited;
    static int[]dx={-1,1,0,0};
    static int[]dy={0,0,-1,1};
    static int danzi_num;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();
        maze=new int[N][N];
        for(int i=0;i<N;i++){
            String line=sc.next();
            for(int j=0;j<N;j++){
                maze[i][j]=line.charAt(j)-'0';
            }
        }
        int num=0;
        List<Integer> L = new ArrayList<>();
        visited=new boolean[N][N];
        for(int i=0;i<N;i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j]&&maze[i][j]==1) {
                    num=dfs(i, j);
                    L.add(num);
                    danzi_num++;
                }

            }
        }
        Collections.sort(L);
        System.out.println(danzi_num);
        for(int x:L){
            System.out.println(x);
        }

    }
    static int dfs(int x,int y){
        visited[x][y]=true;
        int count=1;
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0&&ny>=0&&nx<N&&ny<N&&!visited[nx][ny]){
                if(maze[nx][ny]!=0){
                    count+=dfs(nx,ny);
                }
            }

        }
        return count;
    }
}
