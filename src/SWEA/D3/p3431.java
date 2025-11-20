package SWEA.D3;

import java.util.Scanner;

public class p3431 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int L=sc.nextInt();
            int U=sc.nextInt();
            int X=sc.nextInt();
            System.out.print("#"+tc+" ");
            if(X>U){
                System.out.println(-1);
            }
            else{
                if(L<=X) {
                    System.out.println(0);
                }
                else{
                    System.out.println(L-X);
                }
            }

        }
    }
}
