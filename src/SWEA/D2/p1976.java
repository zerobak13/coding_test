package SWEA.D2;

import java.util.Scanner;

public class p1976 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int h1=sc.nextInt();
            int m1=sc.nextInt();
            int h2=sc.nextInt();
            int m2=sc.nextInt();
            int hsum=0;
            int msum=0;

            if(m1+m2>=60){
                hsum+=1;
                msum=m1+m2-60;
            }
            else{
                msum=m1+m2;
            }
            if(h1+h2>12){
                hsum+=h1+h2-12;
            }
            else{
                hsum+=h1+h2;
            }
            System.out.println("#"+tc+" "+hsum+" "+msum);
        }

    }
}
