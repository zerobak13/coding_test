package SWEA.D2;

import java.util.Scanner;

public class p1945 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();

        for(int tc=1;tc<=T;tc++){
            int[]arr=new int[5];//2,3,5,7,11
            int N=sc.nextInt();
            while(N>1){
                if(N%2==0){
                    N/=2;
                    arr[0]++;
                } else if (N%3==0) {
                    N/=3;
                    arr[1]++;
                }
                else if (N%5==0) {
                    N/=5;
                    arr[2]++;
                }
                else if (N%7==0) {
                    N/=7;
                    arr[3]++;
                }
                else if (N%11==0) {
                    N/=11;
                    arr[4]++;
                }

            }
            System.out.print("#"+tc+" ");
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();

        }

    }
}
