package SWEA.D3;

import java.util.Scanner;

public class p5431 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int N=sc.nextInt();
            int K=sc.nextInt();
            boolean[]arr=new boolean[101];
            for(int i=0;i<K;i++){
                int submit=sc.nextInt();
                arr[submit]=true;
            }
            System.out.print("#"+tc+" ");
            for(int i=1;i<=N;i++){
                if(!arr[i]){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
