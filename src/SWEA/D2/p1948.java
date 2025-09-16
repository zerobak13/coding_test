package SWEA.D2;

import java.util.Scanner;

public class p1948 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        int[]date= new int[]{0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int tc=1;tc<=T;tc++){
            int start_m=sc.nextInt();
            int start_d=sc.nextInt();
            int end_m=sc.nextInt();
            int end_d=sc.nextInt();
            int sum=0;
            if(start_m==end_m){
                sum=end_d-start_d+1;

            }
            else {
                sum += date[start_m] - start_d+1;
                for (int i = start_m + 1; i < end_m; i++) {
                    sum += date[i];
                }
                sum += end_d;
            }
            System.out.println("#"+tc+" "+sum);
        }
    }
}
