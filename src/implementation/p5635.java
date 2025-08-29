package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class p5635 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int oldest=Integer.MAX_VALUE;
        int youngest=Integer.MIN_VALUE;
        String oldP="";
        String youngP="";
        for(int i=0;i<n;i++){
            String name=sc.next();
            int dd=sc.nextInt();
            int mm=sc.nextInt();
            int yyyy=sc.nextInt();
            int birth=10000*yyyy+100*mm+dd;
            if(birth<oldest){
                oldest=birth;
                oldP=name;
            }
            if(birth>youngest){
                youngest=birth;
                youngP=name;
            }


        }
        System.out.println(youngP);
        System.out.println(oldP);

    }
}
