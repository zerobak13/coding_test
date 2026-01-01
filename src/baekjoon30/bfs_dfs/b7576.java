package baekjoon30.bfs_dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b7576 {
    static int N;
    static int M;
    static int[][]arr;
    static boolean[][]visited;
    static int[]dx=new int[]{-1,1,0,0};
    static int[]dy=new int[]{0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        M=sc.nextInt();
        N=sc.nextInt();
        arr=new int[N][M];
        visited=new boolean[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int result=bfs();
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(arr[i][j]==0){
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(result);


    }
    static int bfs(){
        Queue<int[]>q=new LinkedList<>();
        int days=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++) {
                if(arr[i][j]==1) {
                    visited[i][j]=true;
                    q.offer(new int[]{i,j,days});
                }
            }
        }


        while(!q.isEmpty()){
            int[]curr=q.poll();
            int cx=curr[0];
            int cy=curr[1];
            int day=curr[2];
            days=Math.max(days,day);
            for(int i=0;i<4;i++){
                int nx=cx+dx[i];
                int ny=cy+dy[i];
                if(nx>=0&&ny>=0&&nx<N&&ny<M){
                    if(!visited[nx][ny]&&arr[nx][ny]==0){
                        visited[nx][ny]=true;
                        arr[nx][ny]=1;
                        q.offer(new int[]{nx,ny,day+1});
                    }
                }
            }
        }
        return days;
    }
}
