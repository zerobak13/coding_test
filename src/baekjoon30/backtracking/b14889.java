package baekjoon30.backtracking;

import java.util.Scanner;

public class b14889 {
    static int N;
    static boolean[]selected;
    static int[][]arr;
    static int min=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        arr=new int[N][N];
        selected=new boolean[N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        dfs(0,0);
        System.out.println(min);


    }
    static void dfs(int index, int count){
        if(count==N/2){
            calc();
            return;
        }
        for(int i=index;i<N;i++){
            selected[i]=true;
            dfs(i+1,count+1);
            selected[i]=false;
        }
    }
    static void calc(){
        int start=0;
        int link=0;
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++) {
                if(selected[i]&&selected[j]){
                    start+=arr[i][j]+arr[j][i];
                }
                if(!selected[i]&&!selected[j]){
                    link+=arr[i][j]+arr[j][i];
                }
            }
        }
        int diff=Math.abs(start-link);
        min=Math.min(min,diff);
    }
}
