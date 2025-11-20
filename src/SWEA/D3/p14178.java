package SWEA.D3;

import java.util.Scanner;

public class p14178 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int N=sc.nextInt();
            int D=sc.nextInt();
            int count=0;
            for(int i=1;i<=N;i+=(2*D+1)){
                if(i<=N){
                    count++;
                }
            }
            System.out.println("#"+tc+" "+count);
        }
    }
}
