package BackTracking;

import java.util.Scanner;

public class p15650 {
    static int N=0;
    static int M=0;
    static int [] result;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        result = new int[M];
        dfs(1,0);
    }
    static void dfs(int start, int depth){
        System.out.println("호출: depth=" + depth + ", start=" + start);

        if(depth==M){
            for(int i=0;i<M;i++){
                System.out.print(result[i]+" ");

            }
            System.out.println();
            return;
        }

        for(int i=start;i<=N;i++){
            result[depth]=i;//***
            System.out.println(" result[" + depth + "] = " + i);
            dfs(i+1,depth+1);
        }
    }
}
