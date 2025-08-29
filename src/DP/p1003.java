package DP;

import java.util.Scanner;

public class p1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        //int []fibonacci=new int[41];
        //fibonacci[0]=0;
        //fibonacci[1]=1;
        int []zero=new int[41];
        int[]one=new int[41];
        zero[0]=1;
        zero[1]=0;
        one[0]=0;
        one[1]=1;
        for(int i=2;i<41;i++){
            zero[i]=zero[i-1]+zero[i-2];
            one[i]=one[i-1]+one[i-2];
        }

        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            System.out.println(zero[N]+" "+one[N]);
        }

    }
}
