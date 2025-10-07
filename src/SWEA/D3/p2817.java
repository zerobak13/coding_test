package SWEA.D3;

import java.util.Scanner;

public class p2817 {
    static int N;
    static int K;
    static int[]arr;
    static int count;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int sum=0;
            count=0;
            N=sc.nextInt();
            K=sc.nextInt();
            arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }


            dfs(0,0);
            System.out.println("#"+tc+" "+count);
        }
    }

    static void dfs(int x,int sum) {
        if(sum==K){
            count++;
            return;
        }
        if(sum>K||x>=N){
            return;
        }
        dfs(x+1,sum+arr[x]);
        dfs(x+1,sum);


    }
}
