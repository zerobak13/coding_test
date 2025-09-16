package SWEA.D2;

import java.util.Scanner;

public class p1946 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int n=sc.nextInt();
            int count=0;
            System.out.println("#"+tc);
            for(int i=0;i<n;i++){
                String alpha =sc.next();
                int num=sc.nextInt();
                for(int j=0;j<num;j++){
                    count++;
                    System.out.print(alpha);
                    if(count==10){
                        count=0;
                        System.out.println();
                    }


                }

            }
            System.out.println();
        }
    }
}
