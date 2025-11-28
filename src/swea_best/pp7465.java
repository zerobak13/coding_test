package swea_best;

import java.util.Scanner;

public class pp7465 {
    static int[]parent;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int N=sc.nextInt();
            int M=sc.nextInt();
            parent=new int[N+1];
            for(int i=1;i<=N;i++){
                parent[i]=i;
            }

            for(int i=0;i<M;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                union(a,b);
            }
            int count=0;
            for(int i=1;i<=N;i++){
               if(find(i)==i){
                   count++;
               }
            }
            System.out.println("#"+tc+" "+count);

        }
    }
    static int find(int x){
        if(parent[x]==x){
            return parent[x];
        }
        else{
            parent[x]=find(parent[x]);
            return parent[x];
        }
    }
    static void union(int a,int b){
        int na=find(a);
        int nb=find(b);
        if(na==nb){
            return;
        }
        else{
            parent[nb]=na;
            return;
        }
    }
}
