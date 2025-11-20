package SWEA.D3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p7985 {
    static List<List<Integer>> levels;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int K=sc.nextInt();
            int N=(1<<K)-1;
            int[]arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            levels=new ArrayList<>();
            for(int i=0;i<K;i++){
                levels.add(new ArrayList<>());
            }
            dfs(0,N-1,0,arr);
            System.out.print("#"+tc+" ");
            for(int i=0;i<K;i++){
                for(int j=0;j<levels.get(i).size();j++) {
                    System.out.print(levels.get(i).get(j)+" ");
                }
                System.out.println();
            }

        }
    }
    static void dfs(int start, int end, int depth, int[]arr){
        if(start>end){
            return;
        }
        int mid=(start+end)/2;
        levels.get(depth).add(arr[mid]);
        dfs(start,mid-1,depth+1,arr);
        dfs(mid+1,end,depth+1,arr);
    }


}
