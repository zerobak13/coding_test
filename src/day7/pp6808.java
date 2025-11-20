package day7;

import java.util.Scanner;

public class pp6808 {
    static int[]gy;
    static int[]iy;
    static boolean[]used;
    static int win,lose;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++)
        {
            gy=new int[9];
            iy=new int[9];
            win=0;
            lose=0;
            boolean[]check=new boolean[19];
            used=new boolean[9];
            for(int i=0;i<9;i++){
                gy[i]=sc.nextInt();
                check[gy[i]]=true;
            }
            int index=0;
            for(int i=1;i<=18;i++){

                if(!check[i]){
                    iy[index++]=i;
                }
            }
            dfs(0,0,0);

            System.out.println("#"+test_case+" "+lose+" "+win);

        }
    }
    static void dfs(int depth, int gy_score, int iy_score){
        if(depth==9){
            if(iy_score>gy_score){
                win++;
            }
            else{
                lose++;
            }
            return;
        }

        for(int i=0;i<9;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            if(gy[depth]>iy[i]) {
                dfs(depth + 1,gy_score+gy[depth]+iy[i],iy_score );
            }
            else if (gy[depth]<iy[i]) {
                dfs(depth + 1,gy_score,iy_score+gy[depth]+iy[i] );
            }
            else{
                dfs(depth+1,gy_score,iy_score);
            }
            used[i]=false;
        }
    }
}