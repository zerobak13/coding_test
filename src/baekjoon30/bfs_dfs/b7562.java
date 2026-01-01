package baekjoon30.bfs_dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b7562 {
    static int[]dx={-1,-2,-2,-1,1,2,2,1};
    static int[]dy={-2,-1,1,2,-2,-1,1,2};
    static int e_x;
    static int e_y;
    static int I;

    static boolean[][]visited;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            I=sc.nextInt();
            int [][]board=new int[I][I];
            int s_x=sc.nextInt();
            int s_y=sc.nextInt();
            e_x=sc.nextInt();
            e_y=sc.nextInt();
            visited=new boolean[I][I];
            int result=bfs(s_x,s_y);
            System.out.println(result);
        }
    }
    static int bfs(int x,int y){
        Queue<int[]>q=new LinkedList<>();
        q.offer(new int[]{x,y,0});
        visited[x][y]=true;
        while(!q.isEmpty()) {
            int []curr=q.poll();
            int cx=curr[0];
            int cy=curr[1];
            int n_count=curr[2];

            if(cx==e_x&&cy==e_y){
                return n_count;

            }
            for (int i = 0; i < 8; i++) {
                int nx = cx + dx[i];
                int ny = cy+ dy[i];
                if (nx >= 0 && ny >= 0 && nx < I && ny < I) {
                    if(!visited[nx][ny]) {
                        visited[nx][ny]=true;
                        q.offer(new int[]{nx,ny,n_count+1});
                    }



                }
            }

        }
        return 0;
    }
}
