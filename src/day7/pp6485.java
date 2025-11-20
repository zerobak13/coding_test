package day7;

import java.util.Scanner;

public class pp6485 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N=sc.nextInt();
            int[]bus=new int[5002];
            for(int i=0;i<N;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                bus[a]+=1;
                bus[b+1]-=1;
            }
            for(int i=1;i<=5000;i++){
                bus[i]=bus[i-1]+bus[i];
            }

            int P=sc.nextInt();
            System.out.print("#"+test_case+" ");
            for(int i=1;i<=P;i++){
                int stop=sc.nextInt();
                System.out.print(bus[stop]+" ");
            }
            System.out.println();

        }
    }
}