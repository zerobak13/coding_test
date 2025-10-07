package SWEA.D3;

import java.util.Scanner;

public class p1217 {
    static int N;
    static int M;
    static int result;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int tc=1;tc<=10;tc++){
            int tc_num=sc.nextInt();
            N=sc.nextInt();
            M=sc.nextInt();
            dfs(N,0,1);
            System.out.println("#"+tc_num+" "+result);
        }
    }

    private static void dfs(int n, int num,int sum) {
        if(num==M){
            result=sum;
            return;
        }
        dfs(n,num+1,sum*n);
    }
}
