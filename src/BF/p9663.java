package BF;

import java.util.Scanner;

public class p9663 {
    static int N;
    static long count = 0;
    static boolean[]cols;
    static boolean[]diag1;
    static boolean[]diag2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        sc.close();

        cols=new boolean[N];
        diag1=new boolean[2*N-1];
        diag2=new boolean[2*N-1];

        dfs(0);
        System.out.println(count);
    }

    static void dfs(int row){
        if(row==N){
            count++;
            return;
        }
        for(int c=0;c<N;c++){
            int d1=row+c;
            int d2=row-c+(N-1);

            if(!cols[c]&&!diag1[d1]&&!diag2[d2]){
                cols[c]=true;
                diag1[d1]=true;
                diag2[d2]=true;

                dfs(row+1);

                cols[c]=false;
                diag1[d1]=false;
                diag2[d2]=false;

            }
        }
    }
}
