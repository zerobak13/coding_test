package SWEA.D2;

import java.util.Scanner;

public class p1940 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int N=sc.nextInt();
            int distance=0;
            int speed=0;
            for(int i=0;i<N;i++){
                int command=sc.nextInt();
                if(command==1){
                    int acc=sc.nextInt();
                    speed+=acc;
                    distance+=speed;
                } else if (command==2) {
                    int dec=sc.nextInt();
                    speed-=dec;
                    if(speed<0){
                        speed=0;
                    }
                    distance+=speed;
                } else if (command==0) {
                    distance+=speed;
                }
            }
            System.out.println("#"+tc+" "+distance);
        }
    }
}
