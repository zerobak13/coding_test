package SWEA.D3;

import java.util.Scanner;

public class p22574 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            int N=sc.nextInt();
            int P=sc.nextInt();
            int sum=0;
            for(int i=1;i<=N;i++){
                if((sum+i)==P){
                    sum-=1;
                }
                sum+=i;
            }
            System.out.println(sum);
        }

    }
}
