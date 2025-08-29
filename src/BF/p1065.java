package BF;

import java.util.Scanner;

public class p1065 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int count=0;
        N=Math.min(N,999);

        for(int i=1;i<=N;i++){
            if(i<100){
                count++;
            }
            else{
                int num1=i/100;
                int num2=(i%100)/10;
                int num3=i%10;

                if(num2-num1==num3-num2){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
