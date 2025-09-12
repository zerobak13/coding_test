package SWEA.D2;

import java.util.Scanner;

public class p1970 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int[]change=new int[8];
            int N=sc.nextInt();
            change[0]=N/50000;
            N=N%50000;
            change[1]=N/10000;
            N=N%10000;
            change[2]=N/5000;
            N=N%5000;
            change[3]=N/1000;
            N=N%1000;
            change[4]=N/500;
            N=N%500;
            change[5]=N/100;
            N=N%100;
            change[6]=N/50;
            N=N%50;
            change[7]=N/10;
            N=N%10;
            System.out.println("#"+tc+" ");
            for(int i=0;i<8;i++) {
                System.out.print(change[i]+" ");
            }
            System.out.println();
        }


    }
}
