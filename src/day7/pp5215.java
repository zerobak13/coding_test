package day7;

import java.util.Scanner;

public class pp5215 {
    static  int[]food;
    static int[]kcal;
    static int L;
    static int N;
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
            result=0;
            N=sc.nextInt();
            L=sc.nextInt();
            food = new int[N];
            kcal = new int[N];
            for(int i=0;i<N;i++){
                food[i]=sc.nextInt();
                kcal[i]=sc.nextInt();
            }
            dfs(0,0,0);
            System.out.println("#"+test_case+" "+result);

        }
    }
    static void dfs(int index, int sumF, int sumK){
        if(sumK>L){
            return;
        }
        if(index==N){
            result=Math.max(result,sumF);
            return;
        }
        dfs(index+1,sumF+food[index],sumK+kcal[index]);
        dfs(index+1,sumF,sumK);
    }
}