package SWEA.D3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p5215 {
    static int L;
    static int N;
    static int[]score;
    static int[]kcal;
    static int max=0;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            max=0;
            N=sc.nextInt();
            L=sc.nextInt();
            score=new int[N];
            kcal=new int [N];
            for(int i=0;i<N;i++){
                score[i]=sc.nextInt();
                kcal[i]=sc.nextInt();
            }
            dfs(0,0,0);
            System.out.println("#"+tc+" "+max);
        }
    }
    static void dfs(int index,int score_sum,int kcal_sum){
        if(kcal_sum>L){
            return;
        }
        if(index==N){
            max=Integer.max(max,score_sum);
            return;
        }
        dfs(index+1,score_sum,kcal_sum);
        dfs(index+1,score_sum+score[index],kcal_sum+kcal[index]);


    }
}
