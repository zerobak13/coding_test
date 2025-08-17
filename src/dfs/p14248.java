package dfs;

import java.util.Scanner;

public class p14248 {

    static int[]arr;
    static boolean[]visited;
    static int n=0;
    static int count=0;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        arr=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        int s=sc.nextInt();
        visited=new boolean[n+1];
        dfs(s);
        System.out.println(count);

    }

    private static void dfs(int x){
        visited[x]=true;
        count++;
        if(x+arr[x]<=n&&visited[x+arr[x]]!=true){
            dfs(x+arr[x]);
        }
        if(x-arr[x]>=1&&visited[x-arr[x]]!=true){
            dfs(x-arr[x]);
        }

    }
}
