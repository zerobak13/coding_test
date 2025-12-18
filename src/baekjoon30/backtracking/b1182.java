package baekjoon30.backtracking;

import java.util.Scanner;

public class b1182 {
    static int[]num;
    static boolean[]visited;
    static int N;
    static int S;
    static int result=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        S=sc.nextInt();
        num=new int[N];
        visited=new boolean[N];
        for(int i=0;i<N;i++){
            num[i]=sc.nextInt();
        }
        dfs(0,0);
        //아무것도 안고른 경우 0일때 제거
        if(S==0){
            result--;
        }
        System.out.println(result);
    }
    static void dfs(int index, int sum){
        if(index==N){
            if(sum==S){
                result++;
            }
            return;
        }
        dfs(index+1,sum+num[index]);
        dfs(index+1,sum);
    }

}
