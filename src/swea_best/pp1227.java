package swea_best;

import java.util.*;

public class pp1227 {
    static int[]dx={-1,1,0,0};
    static int[]dy={0,0,-1,1};
    static int[][]maze;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        maze=new int[100][100];
        for(int tc=1;tc<=10;tc++){
            int T=sc.nextInt();
            int start_x = -1;
            int start_y = -1;
            for(int i=0;i<100;i++) {
                String line = sc.next();
                for (int j = 0; j < 100; j++) {
                    maze[i][j] = line.charAt(j) - '0';
                    if (maze[i][j] == 2) {
                        start_x = i;
                        start_y = j;
                    }
                }
            }
            System.out.print("#"+T+" ");
            if(bfs(start_x,start_y)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }



        }

    }
    static boolean bfs(int x,int y){
        Queue<int[]>q=new LinkedList<>();
        boolean[][]visited=new boolean[100][100];
        q.add(new int[]{x,y});
        visited[x][y]=true;
        while(!q.isEmpty()) {
            int[]n=q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = n[0] + dx[i];
                int ny = n[1] + dy[i];
                if (nx >= 0 && ny >= 0 && nx < 100 && ny < 100 && !visited[nx][ny]&&maze[nx][ny]!=1) {
                    visited[nx][ny] = true;
                    if(maze[nx][ny]==3){
                        return true;
                    }
                    q.add(new int[]{nx, ny});
                }
            }

        }


        return false;
    }
}
