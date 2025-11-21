package day7;

import java.util.Scanner;

public class pp1873 {
    static char[]tank={'^','v','<','>'};
    static int[]dx={-1,1,0,0};
    static int[]dy={0,0,-1,1};
    static int cur=0;
    static char[][]map;
    static int t_x;
    static int t_y;
    static int H;
    static int W;
    public static void main(String[] args) {
   	/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++) {
           H=sc.nextInt();
           W=sc.nextInt();
           t_x=0;
           t_y=0;
           map=new char[H][W];
           for(int i=0;i<H;i++){
               String line=sc.next();
               for(int j=0;j<W;j++){
                   map[i][j]=line.charAt(j);
                   if(map[i][j]=='^'){
                       cur=0; t_x=i; t_y=j;
                   }
                   else if(map[i][j]=='v'){
                       cur=1; t_x=i; t_y=j;
                   }
                   else if(map[i][j]=='<'){
                       cur=2; t_x=i; t_y=j;
                   }
                   else if(map[i][j]=='>'){
                       cur=3; t_x=i; t_y=j;
                   }

               }
           }
           int N=sc.nextInt();
           String cmd=sc.next();
           for(int i=0;i<N;i++){
               char c=cmd.charAt(i);
               if(c=='S'){
                   shoot();
               }
               else{
                   move(c);
               }
           }
            System.out.print("#"+test_case+" ");
            for(int i=0;i<H;i++){
                for(int j=0;j<W;j++) {
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }

        }
    }
    static void move(char c){
        if(c=='U'){
            cur=0;
        }
        else if(c=='D'){
            cur=1;
        }
        else if(c=='L'){
            cur=2;
        }
        else if(c=='R'){
            cur=3;
        }
        int nx=t_x+dx[cur];
        int ny=t_y+dy[cur];
        if(nx>=0&&nx<H&&ny>=0&&ny<W&&map[nx][ny]=='.') {
            map[nx][ny] = tank[cur];
            map[t_x][t_y]='.';
            t_x=nx;
            t_y=ny;
        }
        else{
            map[t_x][t_y]=tank[cur];
        }



    }
    static void shoot(){
        int nx=t_x;
        int ny=t_y;
        while(true){
            nx+=dx[cur];
            ny+=dy[cur];
            if(nx<0||nx>=H||ny<0||ny>=W){
                break;
            }
            if(map[nx][ny]=='*'){
                map[nx][ny]='.';
                break;
            }
            if(map[nx][ny]=='#'){
                break;
            }


        }

    }
}