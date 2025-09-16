package SWEA.D2;

import java.util.Scanner;

public class p1284 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();

        for(int tc=1;tc<=T;tc++){
            int P=sc.nextInt();
            int Q=sc.nextInt();
            int R=sc.nextInt();
            int S=sc.nextInt();
            int W=sc.nextInt();

            int A=W*P;
            int B;
            if(W<=R){
                B=Q;
            }
            else{
                B=Q+(W-R)*S;
            }
            System.out.println("#"+tc+" "+Math.min(A,B));

        }


    }
}
