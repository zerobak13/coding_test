package SWEA.D3;

import java.util.Scanner;

public class p4299 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int D=sc.nextInt();
            int H=sc.nextInt();
            int M=sc.nextInt();
            System.out.print("#"+tc+" ");
            if(D<11||(D<=11&&H<11)||(D<=11&&H<=11&&M<11)){
                System.out.println(-1);
                return;
            }
            int sum=0;
            sum+=(D-11)*24*60+(H-11)*60+(M-11);
            System.out.println(sum);

        }
    }
}
