package dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p2667 {
    static int N;
    static int[][]map;
    static boolean[][]visited;
    static int []dx={-1,1,0,0};
    static int []dy={0,0,-1,1};

    static int dfs(int x, int y){
        visited[x][y]=true;
        int count=1;//누적
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];

            if(nx>=0&&nx<N&&ny>=0&&ny<N){
                if(!visited[nx][ny]&&map[nx][ny]==1){
                    count+= dfs(nx,ny);
                }
            }
        }
        return count;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        map=new int[N][N];
        visited=new boolean[N][N];
        for(int i=0;i<N;i++){
            String line=sc.next();
            for(int j=0;j<N;j++){
                map[i][j]=line.charAt(j)-'0';
            }
        }
        List<Integer>result=new ArrayList<>();
        for(int i=0;i<N;i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j]&&map[i][j]==1){
                    int town_size=dfs(i,j);
                    result.add(town_size);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(int c:result){
            System.out.println(c);
        }







    }
}
