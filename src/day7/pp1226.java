package day7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class pp1226 {
    static boolean[][]visited;
    static int[][]maze;
    static int[]dx={-1,1,0,0};
    static int[]dy={0,0,-1,1};
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        for(int tc=1;tc<=10;tc++){
            int test_num=sc.nextInt();
            maze=new int[16][16];
            visited=new boolean[16][16];
            int start_x=0;
            int start_y=0;
            for(int i=0;i<16;i++){
                String line=sc.next();
                for(int j=0;j<16;j++){
                    maze[i][j]=line.charAt(j)-'0';
                    if (maze[i][j] == 2) {
                        start_x = i;
                        start_y = j;
                    }
                }
            }
            int result=bfs(start_x,start_y);
            System.out.println("#"+test_num+" "+result);


        }
    }
    static int bfs(int start_x, int start_y){
        Queue<int[]>q=new LinkedList<>();
        visited[start_x][start_y]=true;
        q.add(new int[]{start_x,start_y});
        while(!q.isEmpty()){
            int[]curr=q.poll();

            for(int i=0;i<4;i++){
              int nx=curr[0]+dx[i];
              int ny=curr[1]+dy[i];

              if(nx<0||nx>15||ny<0||ny>15){
                  continue;
              }
              if(maze[nx][ny]==1){
                  continue;
              }
              if(visited[nx][ny]){
                  continue;
              }
              if(maze[nx][ny]==3){
                  return 1;
              }
              visited[nx][ny]=true;
              q.add(new int[]{nx,ny});

            }
        }

        return 0;
    }
}
