package baekjoon30.backtracking;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class b15686 {
    static int N;
    static int M;
    static List<int[]> houses;
    static List<int[]>chickens;
    static boolean[]selected;
    static int result=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        houses=new LinkedList<>();
        chickens=new LinkedList<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int v=sc.nextInt();
                if(v==1){
                    houses.add(new int[]{i,j});
                }
                else if(v==2){
                    chickens.add(new int[]{i,j});
                }
            }
        }
        selected=new boolean[chickens.size()];
        dfs(0,0);
        System.out.println(result);

    }
    static void dfs(int index, int count){
        if(count==M){
            result=Math.min(result,calc());
            return;
        }
        if(index==chickens.size()){
            return;
        }
               selected[index]=true;
               dfs(index+1,count+1);
               selected[index]=false;
               dfs(index+1,count);


    }
    static int calc(){
        int sum=0;
        for(int[]h:houses){
            int min=Integer.MAX_VALUE;
            for(int i=0;i<chickens.size();i++){
                int[]c=chickens.get(i);
                if(selected[i]) {
                    int dist = Math.abs(h[0] - c[0]) + Math.abs(h[1] - c[1]);
                    min = Math.min(min, dist);
                }
            }
            sum+=min;
        }


        return sum;
    }


}
