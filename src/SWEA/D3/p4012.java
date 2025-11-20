package SWEA.D3;

import java.util.Scanner;

public class p4012 {
    static int N;
    static int[][]arr;
    static boolean[]select_A;
    static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++)
        {
            N=sc.nextInt();
            arr=new int[N][N];
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            result=Integer.MAX_VALUE;
            select_A=new boolean[N];
            select_A[0]=true;
            dfs(1,1);
            System.out.println("#"+test_case+" "+result);
        }
    }
    static void dfs(int index, int count){
        if(count==N/2){
            calculate();
            return;
        }
        if(index>=N){
            return;
        }
        select_A[index]=true;
        dfs(index+1,count+1);
        select_A[index]=false;
        dfs(index+1, count);

    }
    static void calculate(){
        int sum_A=0;
        int sum_B=0;
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if(select_A[i]&&select_A[j]){
                    sum_A+=arr[i][j]+arr[j][i];
                }
                if(!select_A[i]&&!select_A[j]){
                    sum_B+=arr[i][j]+arr[j][i];
                }
            }

        }
        result=Math.min(result,Math.abs(sum_A-sum_B));
    }
}
